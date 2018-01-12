/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service;

import cn.xnh.datacenter.user.model.UserAddressDO;

public interface UserAddressService {
    boolean deleteById(Long id);

    UserAddressDO queryById(Long id);

    boolean add(UserAddressDO record);

    boolean updateByParams(UserAddressDO record);

    boolean updateById(UserAddressDO record);
}