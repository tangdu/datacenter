/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service;

import cn.xnh.datacenter.user.model.UserCertificationDO;

public interface UserCertificationService {
    boolean deleteById(Long id);

    UserCertificationDO queryById(Long id);

    long add(UserCertificationDO record);

    boolean updateByParams(UserCertificationDO record);

    boolean updateById(UserCertificationDO record);
}