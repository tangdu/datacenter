/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service;

import cn.xnh.datacenter.user.model.UserFavoriteDO;

public interface UserFavoriteService {
    boolean deleteById(Long id);

    UserFavoriteDO queryById(Long id);

    boolean add(UserFavoriteDO record);

    boolean updateByParams(UserFavoriteDO record);

    boolean updateById(UserFavoriteDO record);
}