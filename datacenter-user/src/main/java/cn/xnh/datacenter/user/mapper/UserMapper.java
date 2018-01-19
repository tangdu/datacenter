/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.mapper;

import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.model.UserPageQueryDO;
import com.github.pagehelper.Page;
import java.util.List;

/**
 * 用户登陆信息Mapper操作类
 * 
 * @author tangdu
 * @version $: UserMapper.java, v 0.1 2018年01月19日 下午13:37 tangdu Exp $ 
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
	 * @param userDO 用户登陆信息删除对象
	 * @return 影响行
     */
    int deleteById(UserDO userDO);

    /**
     * 添加用户登陆信息信息
	 * 
	 * @param userDO 用户登陆信息信息
	 * @return 影响行数
     */
    int add(UserDO userDO);

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
	 * @param userDO 用户登陆信息更新信息
	 * @return 影响行数
     */
    int updateById(UserDO userDO);

    /**
     * 选择更新用户登陆信息信息
	 * 
	 * @param userDO 用户登陆信息更新信息
	 * @return 影响行数
     */
    int updateByParams(UserDO userDO);
}