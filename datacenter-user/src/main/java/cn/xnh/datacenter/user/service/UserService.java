/**
 * xnh.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package cn.xnh.datacenter.user.service;

import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.model.user.UserDelBatDO;
import cn.xnh.datacenter.user.model.user.UserDelDO;
import cn.xnh.datacenter.user.model.user.UserPageQueryDO;

public interface UserService {
    boolean deleteById(UserDelDO userDelDO);

    boolean batchDeleteUserById(UserDelBatDO userDelBatDO);

    UserDO queryById(Long id);

    long add(UserDO record);

    boolean updateByParams(UserDO record);

    boolean updateById(UserDO record);

    PageData<UserDO> pageQuery(UserPageQueryDO userPageQueryDO);
}