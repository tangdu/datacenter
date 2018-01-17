/**
 * xnh.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package cn.xnh.datacenter.user.mapper;

import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.model.user.UserDelBatDO;
import cn.xnh.datacenter.user.model.user.UserDelDO;
import cn.xnh.datacenter.user.model.user.UserPageQueryDO;
import com.github.pagehelper.Page;

public interface UserMapper {
    int deleteById(UserDelDO userDelDO);

    int batchDeleteUserById(UserDelBatDO userDelBatDO);

    int add(UserDO record);

    UserDO queryById(Long id);

    Page<UserDO> queryPage(UserPageQueryDO userPageQueryDO);

    int updateById(UserDO record);

    int updateByParams(UserDO record);
}