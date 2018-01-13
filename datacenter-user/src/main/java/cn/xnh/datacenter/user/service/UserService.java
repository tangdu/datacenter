/**
 * xnh.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package cn.xnh.datacenter.user.service;

import cn.xnh.datacenter.user.model.UserDO;

public interface UserService {
    boolean deleteById(Long id);

    UserDO queryById(Long id);

    boolean add(UserDO record);

    boolean updateByParams(UserDO record);

    boolean updateById(UserDO record);
}