package cn.xnh.datacenter.user.facade.impl;

import cn.luban.commons.object.ObjectUtils;
import cn.luban.commons.result.Result;
import cn.luban.commons.result.Results;
import cn.luban.commons.ro.PageData;
import cn.luban.commons.validate.ValidateTools;
import cn.xnh.datacenter.user.facade.ro.UserRO;
import cn.xnh.datacenter.user.facade.ro.query.UserPageQueryRO;
import cn.xnh.datacenter.user.facade.service.UserFacade;
import cn.xnh.datacenter.user.facade.statecode.UserStateCode;
import cn.xnh.datacenter.user.model.UserDO;
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
    public Result<UserRO> queryUserById(Long userId) {
        ValidateTools.checkNull(userId, "用户ID不能为空");
        UserDO user = userService.queryById(userId);
        if (user != null) {
            UserRO userRO = ObjectUtils.copy(user, UserRO.class);
            return Results.success(userRO);
        }
        return Results.failed(UserStateCode.USER_NOT_FOUND);
    }

    @Override
    public Result<Boolean> deleteUserById(Long userId) {
        ValidateTools.checkNull(userId, "用户ID不能为空");
        return Results.success(userService.deleteById(userId));
    }

    @Override
    public Result<Long> addUser(UserRO userRO) {
        ValidateTools.validate(userRO);
        UserDO userDO = ObjectUtils.copy(userRO, UserDO.class);
        return Results.success(userService.add(userDO));
    }

    @Override
    public Result<Boolean> updateUser(UserRO userRO) {
        ValidateTools.validate(userRO);
        UserDO userDO = ObjectUtils.copy(userRO, UserDO.class);
        return Results.success(userService.updateByParams(userDO));
    }

    @Override
    public Result<PageData<UserRO>> pageQueryUser(UserPageQueryRO userPageQueryRO) {
        PageData<UserDO> userDOPageData = userService.pageQuery(userPageQueryRO);
        if (userDOPageData != null) {
            PageData<UserRO> pageData = ObjectUtils.copy(userDOPageData, PageData.class);
            pageData.setResultList(ObjectUtils.copyList(userDOPageData.getResultList(), UserRO.class));
            return Results.success(pageData);
        }
        return Results.success(new PageData<UserRO>());
    }
}
