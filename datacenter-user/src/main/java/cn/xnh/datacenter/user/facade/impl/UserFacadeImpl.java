/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.facade.impl;

import cn.luban.commons.object.ObjectUtils;
import cn.luban.commons.result.Result;
import cn.luban.commons.result.Results;
import cn.luban.commons.ro.PageData;
import cn.luban.commons.validate.ValidateTools;
import cn.xnh.datacenter.user.facade.ro.UserDelRO;
import cn.xnh.datacenter.user.facade.ro.UserPageQueryRO;
import cn.xnh.datacenter.user.facade.ro.UserRO;
import cn.xnh.datacenter.user.facade.service.UserFacade;
import cn.xnh.datacenter.user.facade.statecode.UserStateCode;
import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.model.UserPageQueryDO;
import cn.xnh.datacenter.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户登陆信息服务生产者
 * 
 * @author tangdu
 * @version $: UserFacadeImpl.java, v 0.1 2018年01月19日 下午13:37 tangdu Exp $ 
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
    public Result<UserRO> queryUserById(Long userId) {
        ValidateTools.checkNull(userId, "ID不能为空");
		UserDO userDO = this.userService.queryById(userId);
		if (userDO != null) {
			return Results.success(ObjectUtils.copy(userDO,UserRO.class));
		}
		return Results.failed(UserStateCode.USERDO_NOT_FOUND);
    }

    /**
     * 分页查询用户登陆信息信息
	 * 
	 * @param userPageQueryRO 用户登陆信息查询对象
	 * @return 用户登陆信息分页
     */
    @Override
    public Result<PageData<UserRO>> pageUserQuery(UserPageQueryRO userPageQueryRO) {
        ValidateTools.validate(userPageQueryRO);
		UserPageQueryDO userPageQueryDO = ObjectUtils.copy(userPageQueryRO,UserPageQueryDO.class);
		PageData<UserDO> userPageData = this.userService.pageQuery(userPageQueryDO);
		PageData<UserRO> pageData = ObjectUtils.copy(userPageData, PageData.class);
		pageData.setResultList(ObjectUtils.copyList(userPageData.getResultList(), UserRO.class));
		return Results.success(pageData);
    }

    /**
     * 添加用户登陆信息信息
	 * 
	 * @param userRO 用户登陆信息信息
	 * @return 用户登陆信息信息
     */
    @Override
    public Result<Long> addUser(UserRO userRO) {
        ValidateTools.validate(userRO);
		UserDO userDO = ObjectUtils.copy(userRO,UserDO.class);
		Long result=this.userService.add(userDO);
		if(result==null || result<1) {
			return Results.failed(UserStateCode.USERDO_NOT_FOUND);
		}
		return Results.success(result);
    }

    /**
     * 更新用户登陆信息信息
	 * 
	 * @param userRO 用户登陆信息更新信息
	 * @return 成功或失败
     */
    @Override
    public Result<Boolean> updateUserById(UserRO userRO) {
        ValidateTools.validate(userRO);
		UserDO userDO = ObjectUtils.copy(userRO,UserDO.class);
		return Results.success(this.userService.updateById(userDO));
    }

    /**
     * 选择更新用户登陆信息信息
	 * 
	 * @param userRO 用户登陆信息更新信息
	 * @return 成功或失败
     */
    @Override
    public Result<Boolean> updateUserByParams(UserRO userRO) {
        ValidateTools.validate(userRO);
		UserDO userDO = ObjectUtils.copy(userRO,UserDO.class);
		return Results.success(this.userService.updateByParams(userDO));
    }

    /**
     * 根据ID删除用户登陆信息信息
	 * 
	 * @param userDelRO 用户登陆信息删除对象
	 * @return 成功或失败
     */
    @Override
    public Result<Boolean> deleteUserById(UserDelRO userDelRO) {
        ValidateTools.validate(userDelRO);
		UserDO userDO = ObjectUtils.copy(userDelRO,UserDO.class);
		return Results.success(this.userService.deleteById(userDO));
    }
}