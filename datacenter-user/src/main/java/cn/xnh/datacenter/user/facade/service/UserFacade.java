/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.facade.service;

import cn.luban.commons.result.Result;
import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.facade.ro.UserDelRO;
import cn.xnh.datacenter.user.facade.ro.UserPageQueryRO;
import cn.xnh.datacenter.user.facade.ro.UserRO;

/**
 * 用户登陆信息服务消费者
 * 
 * @author tangdu
 * @version $: UserFacade.java, v 0.1 2018年01月19日 下午13:37 tangdu Exp $ 
 */
public interface UserFacade {
    /**
     * 根据ID查询用户登陆信信息
	 * 
	 * @param userId 用户登陆信ID
	 * @return 用户登陆信信息
     */
    Result<UserRO> queryUserById(Long userId);

    /**
     * 分页查询用户登陆信信息
	 * 
	 * @param userPageQueryRO 用户登陆信查询对象
	 * @return 用户登陆信分页结果
     */
    Result<PageData<UserRO>> pageUserQuery(UserPageQueryRO userPageQueryRO);

    /**
     * 添加用户登陆信信息
	 * 
	 * @param userRO 用户登陆信信息
	 * @return 用户登陆信信息
     */
    Result<Long> addUser(UserRO userRO);

    /**
     * 更新用户登陆信信息
	 * 
	 * @param userRO 用户登陆信更新信息
	 * @return 成功或失败
     */
    Result<Boolean> updateUserById(UserRO userRO);

    /**
     * 选择更新用户登陆信信息
	 * 
	 * @param userRO 用户登陆信更新信息
	 * @return 成功或失败
     */
    Result<Boolean> updateUserByParams(UserRO userRO);

    /**
     * 根据ID删除用户登陆信信息
	 * 
	 * @param userDelRO 用户登陆信删除对象
	 * @return 成功或失败
     */
    Result<Boolean> deleteUserById(UserDelRO userDelRO);
}