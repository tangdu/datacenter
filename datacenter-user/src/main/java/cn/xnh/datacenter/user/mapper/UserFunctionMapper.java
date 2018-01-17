/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.mapper;

import cn.xnh.datacenter.user.model.UserFunctionDO;
import com.github.pagehelper.Page;

public interface UserFunctionMapper {
    int deleteById(Long id);

    long add(UserFunctionDO record);

    UserFunctionDO queryById(Long id);

    Page<UserFunctionDO> queryPage();

    int updateById(UserFunctionDO record);

    int updateByParams(UserFunctionDO record);
}