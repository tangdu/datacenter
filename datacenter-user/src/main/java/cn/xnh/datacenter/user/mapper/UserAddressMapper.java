/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.mapper;

import cn.xnh.datacenter.user.model.UserAddressDO;
import cn.xnh.datacenter.user.model.useraddress.UserAddressBatDelDO;
import cn.xnh.datacenter.user.model.useraddress.UserAddressDelDO;
import cn.xnh.datacenter.user.model.useraddress.UserAddressPageQueryDO;
import com.github.pagehelper.Page;

/**
 * 用户收货地址Mapper操作类
 * 
 * @author tangdu
 * @version $: UserAddressMapper.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
public interface UserAddressMapper {
    /**
     * 根据ID删除用户收货地址信息
	 * 
	 * @param id 用户收货地址ID
	 * @return 影响行
     */
    int deleteRow(Long id);

    /**
     * 根据ID删除用户收货地址信息
	 * 
	 * @param userAddressDelDO 用户收货地址删除对象
	 * @return 影响行
     */
    int deleteById(UserAddressDelDO userAddressDelDO);

    /**
     * 根据ID批量删除用户收货地址信息
	 * 
	 * @param userAddressBatDelDO 用户收货地址删除对象
	 * @return 影响行
     */
    int batchDeleteById(UserAddressBatDelDO userAddressBatDelDO);

    /**
     * 添加用户收货地址信息
	 * 
	 * @param userAddress 用户收货地址信息
	 * @return 影响行数
     */
    int add(UserAddressDO userAddress);

    /**
     * 根据ID查询用户收货地址信息
	 * 
	 * @param id 用户收货地址ID
	 * @return 用户收货地址信息
     */
    UserAddressDO queryById(Long id);

    /**
     * 分页查询用户收货地址信息
	 * 
	 * @param userAddressPageQueryDO 用户收货地址查询对象
	 * @return 用户收货地址分页结果
     */
    Page<UserAddressDO> queryPage(UserAddressPageQueryDO userAddressPageQueryDO);

    /**
     * 更新用户收货地址信息
	 * 
	 * @param userAddress 用户收货地址更新信息
	 * @return 影响行数
     */
    int updateById(UserAddressDO userAddress);

    /**
     * 选择更新用户收货地址信息
	 * 
	 * @param userAddress 用户收货地址更新信息
	 * @return 影响行数
     */
    int updateByParams(UserAddressDO userAddress);
}