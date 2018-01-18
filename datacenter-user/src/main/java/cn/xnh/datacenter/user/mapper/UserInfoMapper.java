/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.mapper;

import cn.xnh.datacenter.user.model.UserInfoDO;
import cn.xnh.datacenter.user.model.userinfo.UserInfoBatDelDO;
import cn.xnh.datacenter.user.model.userinfo.UserInfoDelDO;
import cn.xnh.datacenter.user.model.userinfo.UserInfoPageQueryDO;
import com.github.pagehelper.Page;

/**
 * 用户信息Mapper操作类
 * 
 * @author tangdu
 * @version $: UserInfoMapper.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
public interface UserInfoMapper {
    /**
     * 根据ID删除用户信息信息
	 * 
	 * @param id 用户信息ID
	 * @return 影响行
     */
    int deleteRow(Long id);

    /**
     * 根据ID删除用户信息信息
	 * 
	 * @param userInfoDelDO 用户信息删除对象
	 * @return 影响行
     */
    int deleteById(UserInfoDelDO userInfoDelDO);

    /**
     * 根据ID批量删除用户信息信息
	 * 
	 * @param userInfoBatDelDO 用户信息删除对象
	 * @return 影响行
     */
    int batchDeleteById(UserInfoBatDelDO userInfoBatDelDO);

    /**
     * 添加用户信息信息
	 * 
	 * @param userInfo 用户信息信息
	 * @return 影响行数
     */
    int add(UserInfoDO userInfo);

    /**
     * 根据ID查询用户信息信息
	 * 
	 * @param id 用户信息ID
	 * @return 用户信息信息
     */
    UserInfoDO queryById(Long id);

    /**
     * 分页查询用户信息信息
	 * 
	 * @param userInfoPageQueryDO 用户信息查询对象
	 * @return 用户信息分页结果
     */
    Page<UserInfoDO> queryPage(UserInfoPageQueryDO userInfoPageQueryDO);

    /**
     * 更新用户信息信息
	 * 
	 * @param userInfo 用户信息更新信息
	 * @return 影响行数
     */
    int updateById(UserInfoDO userInfo);

    /**
     * 选择更新用户信息信息
	 * 
	 * @param userInfo 用户信息更新信息
	 * @return 影响行数
     */
    int updateByParams(UserInfoDO userInfo);
}