/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service;

import cn.xnh.datacenter.user.model.UserInfoDO;

public interface UserInfoService {
    boolean deleteById(Long id);

    UserInfoDO queryById(Long id);

    long add(UserInfoDO record);

    boolean updateByParams(UserInfoDO record);

    boolean updateById(UserInfoDO record);
}