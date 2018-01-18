/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service.impl;

import cn.luban.commons.object.ObjectUtils;
import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.mapper.UserMapper;
import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.model.user.UserBatDelDO;
import cn.xnh.datacenter.user.model.user.UserDelDO;
import cn.xnh.datacenter.user.model.user.UserPageQueryDO;
import cn.xnh.datacenter.user.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户登陆信息服务实现
 * 
 * @author tangdu
 * @version $: UserServiceImpl.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据ID查询用户登陆信息信息
	 * 
	 * @param id 用户登陆信息ID
	 * @return 用户登陆信息信息
     */
    @Override
    public UserDO queryById(Long id) {
        return this.userMapper.queryById(id);
    }

    /**
     * 分页查询用户登陆信息信息
	 * 
	 * @param pageDO 用户登陆信息信息
	 * @return 用户登陆信息分页结果
     */
    @Override
    public PageData<UserDO> pageQuery(UserPageQueryDO pageDO) {
        PageHelper.startPage(pageDO.getPageNo(), pageDO.getPageSize());
		Page<UserDO> page = this.userMapper.queryPage(pageDO);
		PageData<UserDO> pageData = ObjectUtils.copy(pageDO, PageData.class);
		pageData.setResultList(page.getResult());
		pageData.setTotalPage(page.getPages());
		pageData.setTotalSize((int) page.getTotal());
		return pageData;
    }

    /**
     * 添加用户登陆信息信息
	 * 
	 * @param user 用户登陆信息信息
	 * @return 用户登陆信息记录ID
     */
    @Override
    public Long add(UserDO user) {
        boolean flag = this.userMapper.add(user) > 0;
		if (flag) {
			return user.getId();
		}
		return 0L;
    }

    /**
     * 更新用户登陆信息信息
	 * 
	 * @param user 用户登陆信息更新信息
	 * @return 成功或失败
     */
    @Override
    public boolean updateById(UserDO user) {
        boolean flag = this.userMapper.updateById(user) > 0;
		return flag;
    }

    /**
     * 选择更新用户登陆信息信息
	 * 
	 * @param user 用户登陆信息更新信息
	 * @return 成功或失败
     */
    @Override
    public boolean updateByParams(UserDO user) {
        boolean flag = this.userMapper.updateByParams(user) > 0;
		return flag;
    }

    /**
     * 根据ID删除用户登陆信息信息
	 * 
	 * @param userDelDO 用户登陆信息删除对象
	 * @return 成功或失败
     */
    @Override
    public boolean deleteById(UserDelDO userDelDO) {
        boolean flag = this.userMapper.deleteById(userDelDO) > 0;
		return flag;
    }

    /**
     * 根据ID批量删除用户登陆信息信息
	 * 
	 * @param userBatDelDO 用户登陆信息删除对象
	 * @return 成功或失败
     */
    @Override
    public boolean batchDeleteById(UserBatDelDO userBatDelDO) {
        boolean flag = this.userMapper.batchDeleteById(userBatDelDO) > 0;
		return flag;
    }
}