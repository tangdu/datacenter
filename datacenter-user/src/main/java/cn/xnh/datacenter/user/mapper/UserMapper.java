/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.mapper;

import cn.xnh.datacenter.user.model.UserDO;
import com.github.pagehelper.Page;

public interface UserMapper {
    int deleteById(Long id);

    int add(UserDO record);

    UserDO queryById(Long id);

    Page<UserDO> queryPage();

    int updateById(UserDO record);

    int updateByParams(UserDO record);
}