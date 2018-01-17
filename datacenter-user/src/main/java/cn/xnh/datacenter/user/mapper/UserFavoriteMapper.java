/**
 * xnh.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package cn.xnh.datacenter.user.mapper;

import cn.xnh.datacenter.user.model.UserFavoriteDO;
import com.github.pagehelper.Page;

public interface UserFavoriteMapper {
    int deleteById(Long id);

    long add(UserFavoriteDO record);

    UserFavoriteDO queryById(Long id);

    Page<UserFavoriteDO> queryPage();

    int updateById(UserFavoriteDO record);

    int updateByParams(UserFavoriteDO record);
}