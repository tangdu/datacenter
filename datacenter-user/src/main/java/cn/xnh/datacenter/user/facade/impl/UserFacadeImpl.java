package cn.xnh.datacenter.user.facade.impl;

import cn.luban.commons.result.Result;
import cn.luban.commons.result.Results;
import cn.luban.commons.ro.PageData;
import cn.luban.commons.validate.ValidateTools;
import cn.xnh.datacenter.user.facade.service.UserFacade;
import cn.xnh.datacenter.user.facade.statecode.UserStateCode;
import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.model.user.UserDelBatDO;
import cn.xnh.datacenter.user.model.user.UserDelDO;
import cn.xnh.datacenter.user.model.user.UserPageQueryDO;
import cn.xnh.datacenter.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户接口服务提供实现方
 *
 * @author tangdu
 * @version $: UserFacadeImpl.java, v 0.1 2018年01月11日 下午9:35 tangdu Exp $
 */
@Service("userFacade")
public class UserFacadeImpl implements UserFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserFacadeImpl.class);
    @Autowired
    private UserService userService;

    @Override
    public Result<UserDO> queryUserById(Long userId) {
        ValidateTools.checkNull(userId, "用户ID不能为空");
        UserDO user = userService.queryById(userId);
        if (user != null) {
            return Results.success(user);
        }
        return Results.failed(UserStateCode.USER_NOT_FOUND);
    }

    @Override
    public Result<Boolean> deleteUserById(UserDelDO userDelDO) {
        ValidateTools.validate(userDelDO);
        return Results.success(userService.deleteById(userDelDO));
    }

    @Override
    public Result<Boolean> batchDeleteUserById(UserDelBatDO userDelBatDO) {
        ValidateTools.validate(userDelBatDO);
        return Results.success(userService.batchDeleteUserById(userDelBatDO));
    }

    @Override
    public Result<Long> addUser(UserDO userDO) {
        ValidateTools.validate(userDO);
        return Results.success(userService.add(userDO));
    }

    @Override
    public Result<Boolean> updateUser(UserDO userDO) {
        ValidateTools.validate(userDO);
        return Results.success(userService.updateByParams(userDO));
    }

    @Override
    public Result<PageData<UserDO>> pageQueryUser(UserPageQueryDO userPageQueryDO) {
        PageData<UserDO> userDOPageData = userService.pageQuery(userPageQueryDO);
        return Results.success(userDOPageData);
    }
}
