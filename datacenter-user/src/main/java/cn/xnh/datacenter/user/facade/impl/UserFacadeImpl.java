/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.facade.impl;

import cn.luban.commons.result.Result;
import cn.luban.commons.result.Results;
import cn.luban.commons.ro.PageData;
import cn.luban.commons.validate.ValidateTools;
import cn.xnh.datacenter.user.facade.service.UserFacade;
import cn.xnh.datacenter.user.facade.statecode.UserStateCode;
import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.model.user.UserBatDelDO;
import cn.xnh.datacenter.user.model.user.UserDelDO;
import cn.xnh.datacenter.user.model.user.UserPageQueryDO;
import cn.xnh.datacenter.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户登陆信息服务生产者
 * 
 * @author tangdu
 * @version $: UserFacadeImpl.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
@Component("userFacade")
public class UserFacadeImpl implements UserFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserFacadeImpl.class);

    @Autowired
    private UserService userService;

    /**
     * 根据ID查询用户登陆信息信息
	 * 
	 * @param userId 用户登陆信息ID
	 * @return 用户登陆信息信息
     */
    @Override
    public Result<UserDO> queryUserById(Long userId) {
        ValidateTools.checkNull(userId, "ID不能为空");
		UserDO user = this.userService.queryById(userId);
		if (user != null) {
			return Results.success(user);
		}
		return Results.failed(UserStateCode.USER_NOT_FOUND);
    }

    /**
     * 分页查询用户登陆信息信息
	 * 
	 * @param userPageQueryDO 用户登陆信息信息
	 * @return 用户登陆信息分页
     */
    @Override
    public Result<PageData<UserDO>> pageUserQuery(UserPageQueryDO userPageQueryDO) {
        PageData<UserDO> userPageData = this.userService.pageQuery(userPageQueryDO);
		return Results.success(userPageData);
    }

    /**
     * 添加用户登陆信息信息
	 * 
	 * @param user 用户登陆信息信息
	 * @return 用户登陆信息信息
     */
    @Override
    public Result<Long> addUser(UserDO user) {
        ValidateTools.validate(user);
		Long result=this.userService.add(user);
		if(result==null || result<1) {
			return Results.failed(UserStateCode.USER_NOT_FOUND);
		}
		return Results.success(result);
    }

    /**
     * 更新用户登陆信息信息
	 * 
	 * @param user 用户登陆信息更新信息
	 * @return 成功或失败
     */
    @Override
    public Result<Boolean> updateUserById(UserDO user) {
        ValidateTools.validate(user);
		return Results.success(this.userService.updateById(user));
    }

    /**
     * 选择更新用户登陆信息信息
	 * 
	 * @param user 用户登陆信息更新信息
	 * @return 成功或失败
     */
    @Override
    public Result<Boolean> updateUserByParams(UserDO user) {
        ValidateTools.validate(user);
		return Results.success(this.userService.updateByParams(user));
    }

    /**
     * 根据ID删除用户登陆信息信息
	 * 
	 * @param userDelDO 用户登陆信息删除对象
	 * @return 成功或失败
     */
    @Override
    public Result<Boolean> deleteUserById(UserDelDO userDelDO) {
        ValidateTools.validate(userDelDO);
		return Results.success(this.userService.deleteById(userDelDO));
    }

    /**
     * 根据ID批量删除用户登陆信息信息
	 * 
	 * @param userBatDelDO 用户登陆信息删除对象
	 * @return 成功或失败
     */
    @Override
    public Result<Boolean> batchDeleteUserById(UserBatDelDO userBatDelDO) {
        ValidateTools.validate(userBatDelDO);
		return Results.success(this.userService.batchDeleteById(userBatDelDO));
    }
}