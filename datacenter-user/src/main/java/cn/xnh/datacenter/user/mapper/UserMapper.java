/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.mapper;

import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.model.user.UserBatDelDO;
import cn.xnh.datacenter.user.model.user.UserDelDO;
import cn.xnh.datacenter.user.model.user.UserPageQueryDO;
import com.github.pagehelper.Page;

/**
 * 用户登陆信息Mapper操作类
 * 
 * @author tangdu
 * @version $: UserMapper.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
public interface UserMapper {
    /**
     * 根据ID删除用户登陆信息信息
	 * 
	 * @param id 用户登陆信息ID
	 * @return 影响行
     */
    int deleteRow(Long id);

    /**
     * 根据ID删除用户登陆信息信息
	 * 
	 * @param userDelDO 用户登陆信息删除对象
	 * @return 影响行
     */
    int deleteById(UserDelDO userDelDO);

    /**
     * 根据ID批量删除用户登陆信息信息
	 * 
	 * @param userBatDelDO 用户登陆信息删除对象
	 * @return 影响行
     */
    int batchDeleteById(UserBatDelDO userBatDelDO);

    /**
     * 添加用户登陆信息信息
	 * 
	 * @param user 用户登陆信息信息
	 * @return 影响行数
     */
    int add(UserDO user);

    /**
     * 根据ID查询用户登陆信息信息
	 * 
	 * @param id 用户登陆信息ID
	 * @return 用户登陆信息信息
     */
    UserDO queryById(Long id);

    /**
     * 分页查询用户登陆信息信息
	 * 
	 * @param userPageQueryDO 用户登陆信息查询对象
	 * @return 用户登陆信息分页结果
     */
    Page<UserDO> queryPage(UserPageQueryDO userPageQueryDO);

    /**
     * 更新用户登陆信息信息
	 * 
	 * @param user 用户登陆信息更新信息
	 * @return 影响行数
     */
    int updateById(UserDO user);

    /**
     * 选择更新用户登陆信息信息
	 * 
	 * @param user 用户登陆信息更新信息
	 * @return 影响行数
     */
    int updateByParams(UserDO user);
}