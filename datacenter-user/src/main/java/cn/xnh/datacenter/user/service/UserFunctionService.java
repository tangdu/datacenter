/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service;

import cn.xnh.datacenter.user.model.UserFunctionDO;

public interface UserFunctionService {
    boolean deleteById(Long id);

    UserFunctionDO queryById(Long id);

    long add(UserFunctionDO record);

    boolean updateByParams(UserFunctionDO record);

    boolean updateById(UserFunctionDO record);
}