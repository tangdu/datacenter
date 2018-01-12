/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.mapper;

import cn.xnh.datacenter.user.model.UserCertificationDO;
import com.github.pagehelper.Page;

public interface UserCertificationMapper {
    int deleteById(Long id);

    int add(UserCertificationDO record);

    UserCertificationDO queryById(Long id);

    Page<UserCertificationDO> queryPage();

    int updateById(UserCertificationDO record);

    int updateByParams(UserCertificationDO record);
}