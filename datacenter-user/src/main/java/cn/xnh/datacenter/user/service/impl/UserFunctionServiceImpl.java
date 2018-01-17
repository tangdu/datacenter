/**
 * xnh.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package cn.xnh.datacenter.user.service.impl;

import cn.xnh.datacenter.user.mapper.UserFunctionMapper;
import cn.xnh.datacenter.user.model.UserFunctionDO;
import cn.xnh.datacenter.user.service.UserFunctionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 服务实现方
 *
 * @author tangdu
 * @version $: UserFunctionServiceImpl.java, v 0.1 2018年01月12日 下午13:10 tangdu Exp $ 
 */
@Service
public class UserFunctionServiceImpl implements UserFunctionService {
    @Autowired
    private UserFunctionMapper userFunctionMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserFunctionServiceImpl.class);

    @Override
    public UserFunctionDO queryById(Long id) {
        return this.userFunctionMapper.queryById(id);
    }

    @Override
    public boolean deleteById(Long id) {
        return this.userFunctionMapper.deleteById(id) > 0;
    }

    @Override
    public boolean updateByParams(UserFunctionDO record) {
        return this.userFunctionMapper.updateByParams(record) > 0;
    }

    @Override
    public boolean updateById(UserFunctionDO record) {
        return this.userFunctionMapper.updateById(record) > 0;
    }

    @Override
    public long add(UserFunctionDO record) {
        return this.userFunctionMapper.add(record);
    }
}