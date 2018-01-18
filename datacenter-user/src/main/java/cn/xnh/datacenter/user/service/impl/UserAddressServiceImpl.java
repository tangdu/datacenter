/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service.impl;

import cn.luban.commons.object.ObjectUtils;
import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.mapper.UserAddressMapper;
import cn.xnh.datacenter.user.model.UserAddressDO;
import cn.xnh.datacenter.user.model.useraddress.UserAddressBatDelDO;
import cn.xnh.datacenter.user.model.useraddress.UserAddressDelDO;
import cn.xnh.datacenter.user.model.useraddress.UserAddressPageQueryDO;
import cn.xnh.datacenter.user.service.UserAddressService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户收货地址服务实现
 * 
 * @author tangdu
 * @version $: UserAddressServiceImpl.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
@Service
public class UserAddressServiceImpl implements UserAddressService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserAddressServiceImpl.class);

    @Autowired
    private UserAddressMapper userAddressMapper;

    /**
     * 根据ID查询用户收货地址信息
	 * 
	 * @param id 用户收货地址ID
	 * @return 用户收货地址信息
     */
    @Override
    public UserAddressDO queryById(Long id) {
        return this.userAddressMapper.queryById(id);
    }

    /**
     * 分页查询用户收货地址信息
	 * 
	 * @param pageDO 用户收货地址信息
	 * @return 用户收货地址分页结果
     */
    @Override
    public PageData<UserAddressDO> pageQuery(UserAddressPageQueryDO pageDO) {
        PageHelper.startPage(pageDO.getPageNo(), pageDO.getPageSize());
		Page<UserAddressDO> page = this.userAddressMapper.queryPage(pageDO);
		PageData<UserAddressDO> pageData = ObjectUtils.copy(pageDO, PageData.class);
		pageData.setResultList(page.getResult());
		pageData.setTotalPage(page.getPages());
		pageData.setTotalSize((int) page.getTotal());
		return pageData;
    }

    /**
     * 添加用户收货地址信息
	 * 
	 * @param userAddress 用户收货地址信息
	 * @return 用户收货地址记录ID
     */
    @Override
    public Long add(UserAddressDO userAddress) {
        boolean flag = this.userAddressMapper.add(userAddress) > 0;
		if (flag) {
			return userAddress.getId();
		}
		return 0L;
    }

    /**
     * 更新用户收货地址信息
	 * 
	 * @param userAddress 用户收货地址更新信息
	 * @return 成功或失败
     */
    @Override
    public boolean updateById(UserAddressDO userAddress) {
        boolean flag = this.userAddressMapper.updateById(userAddress) > 0;
		return flag;
    }

    /**
     * 选择更新用户收货地址信息
	 * 
	 * @param userAddress 用户收货地址更新信息
	 * @return 成功或失败
     */
    @Override
    public boolean updateByParams(UserAddressDO userAddress) {
        boolean flag = this.userAddressMapper.updateByParams(userAddress) > 0;
		return flag;
    }

    /**
     * 根据ID删除用户收货地址信息
	 * 
	 * @param userAddressDelDO 用户收货地址删除对象
	 * @return 成功或失败
     */
    @Override
    public boolean deleteById(UserAddressDelDO userAddressDelDO) {
        boolean flag = this.userAddressMapper.deleteById(userAddressDelDO) > 0;
		return flag;
    }

    /**
     * 根据ID批量删除用户收货地址信息
	 * 
	 * @param userAddressBatDelDO 用户收货地址删除对象
	 * @return 成功或失败
     */
    @Override
    public boolean batchDeleteById(UserAddressBatDelDO userAddressBatDelDO) {
        boolean flag = this.userAddressMapper.batchDeleteById(userAddressBatDelDO) > 0;
		return flag;
    }
}