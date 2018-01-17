/**
 * xnh.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package cn.xnh.datacenter.user.service.impl;

import cn.xnh.datacenter.user.mapper.UserCertificationMapper;
import cn.xnh.datacenter.user.model.UserCertificationDO;
import cn.xnh.datacenter.user.service.UserCertificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 服务实现方
 *
 * @author tangdu
 * @version $: UserCertificationServiceImpl.java, v 0.1 2018年01月12日 下午13:10 tangdu Exp $
 */
@Service
public class UserCertificationServiceImpl implements UserCertificationService {
    @Autowired
    private UserCertificationMapper userCertificationMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserCertificationServiceImpl.class);

    @Override
    public UserCertificationDO queryById(Long id) {
        return this.userCertificationMapper.queryById(id);
    }

    @Override
    public boolean deleteById(Long id) {
        return this.userCertificationMapper.deleteById(id) > 0;
    }

    @Override
    public boolean updateByParams(UserCertificationDO record) {
        return this.userCertificationMapper.updateByParams(record) > 0;
    }

    @Override
    public boolean updateById(UserCertificationDO record) {
        return this.userCertificationMapper.updateById(record) > 0;
    }

    @Override
    public long add(UserCertificationDO record) {
        return this.userCertificationMapper.add(record);
    }
}