/**
 * xnh.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package cn.xnh.datacenter.user.mapper;

import cn.xnh.datacenter.user.model.UserAddressDO;
import com.github.pagehelper.Page;

public interface UserAddressMapper {
    int deleteById(Long id);

    int add(UserAddressDO record);

    UserAddressDO queryById(Long id);

    Page<UserAddressDO> queryPage();

    int updateById(UserAddressDO record);

    int updateByParams(UserAddressDO record);
}