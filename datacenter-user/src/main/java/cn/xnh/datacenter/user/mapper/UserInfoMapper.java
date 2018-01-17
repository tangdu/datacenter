/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.mapper;

import cn.xnh.datacenter.user.model.UserInfoDO;
import com.github.pagehelper.Page;

public interface UserInfoMapper {
    int deleteById(Long id);

    long add(UserInfoDO record);

    UserInfoDO queryById(Long id);

    Page<UserInfoDO> queryPage();

    int updateById(UserInfoDO record);

    int updateByParams(UserInfoDO record);
}