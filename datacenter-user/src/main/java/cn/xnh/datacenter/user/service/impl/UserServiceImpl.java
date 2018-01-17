/**
 * xnh.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package cn.xnh.datacenter.user.service.impl;

import cn.luban.commons.object.ObjectUtils;
import cn.luban.commons.ro.PageData;
import cn.luban.core.cache.DataLoad;
import cn.luban.core.cache.core.RLongMap;
import cn.luban.core.cache.core.RedisService;
import cn.xnh.datacenter.user.constant.Keys;
import cn.xnh.datacenter.user.mapper.UserMapper;
import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.model.user.UserDelBatDO;
import cn.xnh.datacenter.user.model.user.UserDelDO;
import cn.xnh.datacenter.user.model.user.UserPageQueryDO;
import cn.xnh.datacenter.user.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.assertj.core.util.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * 服务实现方
 *
 * @author tangdu
 * @version $: UserServiceImpl.java, v 0.1 2018年01月12日 下午13:10 tangdu Exp $
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper   userMapper;
    @Autowired
    private RedisService redisService;

    RLongMap<UserDO> cacheUserList = null;

    @PostConstruct
    public void init() {
        cacheUserList = redisService.boundRedisLongMap(Keys.forReidsUserList);
        cacheUserList.setDataLoad(new DataLoad<UserDO>() {
            @Override
            public UserDO load(String key) {
                return userMapper.queryById(Long.valueOf(key.toString()));
            }
        });
    }

    @Override
    public UserDO queryById(Long id) {
        return cacheUserList.get(id);
    }

    @Override
    public boolean deleteById(UserDelDO userDelDO) {
        boolean flag = this.userMapper.deleteById(userDelDO) > 0;
        if (flag) {
            cleanCache(Lists.newArrayList(userDelDO.getId()));
        }
        return flag;
    }

    @Override
    public boolean batchDeleteUserById(UserDelBatDO userDelBatDO) {
        boolean flag = this.userMapper.batchDeleteUserById(userDelBatDO) == userDelBatDO.getIds().size();
        if (flag) {
            cleanCache(userDelBatDO.getIds());
        }
        return false;
    }

    private void cleanCache(List<Long> ids){
        if(CollectionUtils.isEmpty(ids)){
            return;
        }
        cacheUserList.delete(ids);
    }

    @Override
    public boolean updateByParams(UserDO record) {
        boolean flag = this.userMapper.updateByParams(record) > 0;
        if (flag) {
            cleanCache(Lists.newArrayList(record.getId()));
        }
        return flag;
    }

    @Override
    public boolean updateById(UserDO record) {
        boolean flag = this.userMapper.updateById(record) > 0;
        if (flag) {
            cleanCache(Lists.newArrayList(record.getId()));
        }
        return flag;
    }

    @Override
    public long add(UserDO record) {
        boolean flag = this.userMapper.add(record) > 0;
        if (flag) {
            return record.getId();
        }
        return 0L;
    }

    @Override
    public PageData<UserDO> pageQuery(UserPageQueryDO userPageQueryDO) {
        PageHelper.startPage(userPageQueryDO.getPageNo(), userPageQueryDO.getPageSize());
        Page<UserDO> page = this.userMapper.queryPage(userPageQueryDO);
        PageData<UserDO> pageData = ObjectUtils.copy(userPageQueryDO, PageData.class);
        pageData.setResultList(page.getResult());
        pageData.setTotalPage(page.getPages());
        pageData.setTotalSize((int) page.getTotal());
        return pageData;
    }
}