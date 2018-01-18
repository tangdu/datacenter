/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service;

import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.model.UserAddressDO;
import cn.xnh.datacenter.user.model.useraddress.UserAddressBatDelDO;
import cn.xnh.datacenter.user.model.useraddress.UserAddressDelDO;
import cn.xnh.datacenter.user.model.useraddress.UserAddressPageQueryDO;

/**
 * 用户收货地址服务接口
 * 
 * @author tangdu
 * @version $: UserAddressService.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
public interface UserAddressService {
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
	 * @param pageDO 用户收货地址信息
	 * @return 用户收货地址分页结果
     */
    PageData<UserAddressDO> pageQuery(UserAddressPageQueryDO pageDO);

    /**
     * 添加用户收货地址信息
	 * 
	 * @param userAddress 用户收货地址信息
	 * @return 用户收货地址记录ID
     */
    Long add(UserAddressDO userAddress);

    /**
     * 更新用户收货地址信息
	 * 
	 * @param userAddress 用户收货地址更新信息
	 * @return 成功或失败
     */
    boolean updateById(UserAddressDO userAddress);

    /**
     * 选择更新用户收货地址信息
	 * 
	 * @param userAddress 用户收货地址更新信息
	 * @return 成功或失败
     */
    boolean updateByParams(UserAddressDO userAddress);

    /**
     * 根据ID删除用户收货地址信息
	 * 
	 * @param userAddressDelDO 用户收货地址删除对象
	 * @return 成功或失败
     */
    boolean deleteById(UserAddressDelDO userAddressDelDO);

    /**
     * 根据ID批量删除用户收货地址信息
	 * 
	 * @param userAddressBatDelDO 用户收货地址删除对象
	 * @return 成功或失败
     */
    boolean batchDeleteById(UserAddressBatDelDO userAddressBatDelDO);
}