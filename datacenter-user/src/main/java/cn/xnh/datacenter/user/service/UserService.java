/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service;

import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.model.user.UserBatDelDO;
import cn.xnh.datacenter.user.model.user.UserDelDO;
import cn.xnh.datacenter.user.model.user.UserPageQueryDO;

/**
 * 用户登陆信息服务接口
 * 
 * @author tangdu
 * @version $: UserService.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
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
	 * @param pageDO 用户登陆信信息
	 * @return 用户登陆信分页结果
     */
    PageData<UserDO> pageQuery(UserPageQueryDO pageDO);

    /**
     * 添加用户登陆信信息
	 * 
	 * @param user 用户登陆信信息
	 * @return 用户登陆信记录ID
     */
    Long add(UserDO user);

    /**
     * 更新用户登陆信信息
	 * 
	 * @param user 用户登陆信更新信息
	 * @return 成功或失败
     */
    boolean updateById(UserDO user);

    /**
     * 选择更新用户登陆信信息
	 * 
	 * @param user 用户登陆信更新信息
	 * @return 成功或失败
     */
    boolean updateByParams(UserDO user);

    /**
     * 根据ID删除用户登陆信信息
	 * 
	 * @param userDelDO 用户登陆信删除对象
	 * @return 成功或失败
     */
    boolean deleteById(UserDelDO userDelDO);

    /**
     * 根据ID批量删除用户登陆信信息
	 * 
	 * @param userBatDelDO 用户登陆信删除对象
	 * @return 成功或失败
     */
    boolean batchDeleteById(UserBatDelDO userBatDelDO);
}