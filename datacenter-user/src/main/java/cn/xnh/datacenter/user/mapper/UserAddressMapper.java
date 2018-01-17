/**
 * xnh.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package cn.xnh.datacenter.user.mapper;

import cn.xnh.datacenter.user.model.UserAddressDO;

import java.util.List;

public interface UserAddressMapper {
    int deleteById(Long id);

    long add(UserAddressDO record);

    UserAddressDO queryById(Long id);

    List<UserAddressDO> queryByUserId(Long userId);

    int updateById(UserAddressDO record);

    int updateByParams(UserAddressDO record);
}