/**
 * xnh.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package cn.xnh.datacenter.user.service.impl;

import cn.xnh.datacenter.user.mapper.UserFavoriteMapper;
import cn.xnh.datacenter.user.model.UserFavoriteDO;
import cn.xnh.datacenter.user.service.UserFavoriteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 服务实现方
 *
 * @author tangdu
 * @version $: UserFavoriteServiceImpl.java, v 0.1 2018年01月12日 下午13:10 tangdu Exp $ 
 */
@Service
public class UserFavoriteServiceImpl implements UserFavoriteService {
    @Autowired
    private UserFavoriteMapper userFavoriteMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserFavoriteServiceImpl.class);

    @Override
    public UserFavoriteDO queryById(Long id) {
        return this.userFavoriteMapper.queryById(id);
    }

    @Override
    public boolean deleteById(Long id) {
        return this.userFavoriteMapper.deleteById(id) > 0;
    }

    @Override
    public boolean updateByParams(UserFavoriteDO record) {
       return this.userFavoriteMapper.updateByParams(record) > 0;
    }

    @Override
    public boolean updateById(UserFavoriteDO record) {
        return this.userFavoriteMapper.updateById(record) > 0;
    }

    @Override
    public long add(UserFavoriteDO record) {
        return this.userFavoriteMapper.add(record);
    }
}