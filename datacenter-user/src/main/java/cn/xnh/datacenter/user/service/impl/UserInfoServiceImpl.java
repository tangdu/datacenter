/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service.impl;

import cn.luban.commons.object.ObjectUtils;
import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.mapper.UserInfoMapper;
import cn.xnh.datacenter.user.model.UserInfoDO;
import cn.xnh.datacenter.user.model.userinfo.UserInfoBatDelDO;
import cn.xnh.datacenter.user.model.userinfo.UserInfoDelDO;
import cn.xnh.datacenter.user.model.userinfo.UserInfoPageQueryDO;
import cn.xnh.datacenter.user.service.UserInfoService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息服务实现
 * 
 * @author tangdu
 * @version $: UserInfoServiceImpl.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 根据ID查询用户信息信息
	 * 
	 * @param id 用户信息ID
	 * @return 用户信息信息
     */
    @Override
    public UserInfoDO queryById(Long id) {
        return this.userInfoMapper.queryById(id);
    }

    /**
     * 分页查询用户信息信息
	 * 
	 * @param pageDO 用户信息信息
	 * @return 用户信息分页结果
     */
    @Override
    public PageData<UserInfoDO> pageQuery(UserInfoPageQueryDO pageDO) {
        PageHelper.startPage(pageDO.getPageNo(), pageDO.getPageSize());
		Page<UserInfoDO> page = this.userInfoMapper.queryPage(pageDO);
		PageData<UserInfoDO> pageData = ObjectUtils.copy(pageDO, PageData.class);
		pageData.setResultList(page.getResult());
		pageData.setTotalPage(page.getPages());
		pageData.setTotalSize((int) page.getTotal());
		return pageData;
    }

    /**
     * 添加用户信息信息
	 * 
	 * @param userInfo 用户信息信息
	 * @return 用户信息记录ID
     */
    @Override
    public Long add(UserInfoDO userInfo) {
        boolean flag = this.userInfoMapper.add(userInfo) > 0;
		if (flag) {
			return userInfo.getId();
		}
		return 0L;
    }

    /**
     * 更新用户信息信息
	 * 
	 * @param userInfo 用户信息更新信息
	 * @return 成功或失败
     */
    @Override
    public boolean updateById(UserInfoDO userInfo) {
        boolean flag = this.userInfoMapper.updateById(userInfo) > 0;
		return flag;
    }

    /**
     * 选择更新用户信息信息
	 * 
	 * @param userInfo 用户信息更新信息
	 * @return 成功或失败
     */
    @Override
    public boolean updateByParams(UserInfoDO userInfo) {
        boolean flag = this.userInfoMapper.updateByParams(userInfo) > 0;
		return flag;
    }

    /**
     * 根据ID删除用户信息信息
	 * 
	 * @param userInfoDelDO 用户信息删除对象
	 * @return 成功或失败
     */
    @Override
    public boolean deleteById(UserInfoDelDO userInfoDelDO) {
        boolean flag = this.userInfoMapper.deleteById(userInfoDelDO) > 0;
		return flag;
    }

    /**
     * 根据ID批量删除用户信息信息
	 * 
	 * @param userInfoBatDelDO 用户信息删除对象
	 * @return 成功或失败
     */
    @Override
    public boolean batchDeleteById(UserInfoBatDelDO userInfoBatDelDO) {
        boolean flag = this.userInfoMapper.batchDeleteById(userInfoBatDelDO) > 0;
		return flag;
    }
}