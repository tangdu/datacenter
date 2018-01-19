/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service;

import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.model.UserPageQueryDO;

/**
 * 用户登陆信息服务接口
 * 
 * @author tangdu
 * @version $: UserService.java, v 0.1 2018年01月19日 下午13:37 tangdu Exp $ 
 */
public interface UserService {
    /**
     * 根据ID查询用户登陆信信息
	 * 
	 * @param id 用户登陆信ID
	 * @return 用户登陆信信息
     */
    UserDO queryById(Long id);

    /**
     * 分页查询用户登陆信信息
	 * 
	 * @param pageDO 用户登陆信查询对象
	 * @return 用户登陆信分页结果
     */
    PageData<UserDO> pageQuery(UserPageQueryDO pageDO);

    /**
     * 添加用户登陆信信息
	 * 
	 * @param userDO 用户登陆信信息
	 * @return 用户登陆信记录ID
     */
    Long add(UserDO userDO);

    /**
     * 更新用户登陆信信息
	 * 
	 * @param userDO 用户登陆信更新信息
	 * @return 成功或失败
     */
    boolean updateById(UserDO userDO);

    /**
     * 选择更新用户登陆信信息
	 * 
	 * @param userDO 用户登陆信更新信息
	 * @return 成功或失败
     */
    boolean updateByParams(UserDO userDO);

    /**
     * 根据ID删除用户登陆信信息
	 * 
	 * @param userDO 用户登陆信删除对象
	 * @return 成功或失败
     */
    boolean deleteById(UserDO userDO);
}