/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service;

import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.model.UserInfoDO;
import cn.xnh.datacenter.user.model.userinfo.UserInfoBatDelDO;
import cn.xnh.datacenter.user.model.userinfo.UserInfoDelDO;
import cn.xnh.datacenter.user.model.userinfo.UserInfoPageQueryDO;

/**
 * 用户信息服务接口
 * 
 * @author tangdu
 * @version $: UserInfoService.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
public interface UserInfoService {
    /**
     * 根据ID查询用户信信息
	 * 
	 * @param id 用户信ID
	 * @return 用户信信息
     */
    UserInfoDO queryById(Long id);

    /**
     * 分页查询用户信信息
	 * 
	 * @param pageDO 用户信信息
	 * @return 用户信分页结果
     */
    PageData<UserInfoDO> pageQuery(UserInfoPageQueryDO pageDO);

    /**
     * 添加用户信信息
	 * 
	 * @param userInfo 用户信信息
	 * @return 用户信记录ID
     */
    Long add(UserInfoDO userInfo);

    /**
     * 更新用户信信息
	 * 
	 * @param userInfo 用户信更新信息
	 * @return 成功或失败
     */
    boolean updateById(UserInfoDO userInfo);

    /**
     * 选择更新用户信信息
	 * 
	 * @param userInfo 用户信更新信息
	 * @return 成功或失败
     */
    boolean updateByParams(UserInfoDO userInfo);

    /**
     * 根据ID删除用户信信息
	 * 
	 * @param userInfoDelDO 用户信删除对象
	 * @return 成功或失败
     */
    boolean deleteById(UserInfoDelDO userInfoDelDO);

    /**
     * 根据ID批量删除用户信信息
	 * 
	 * @param userInfoBatDelDO 用户信删除对象
	 * @return 成功或失败
     */
    boolean batchDeleteById(UserInfoBatDelDO userInfoBatDelDO);
}