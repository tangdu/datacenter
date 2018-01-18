/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service.impl;

import cn.luban.commons.object.ObjectUtils;
import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.mapper.UserCertificationMapper;
import cn.xnh.datacenter.user.model.UserCertificationDO;
import cn.xnh.datacenter.user.model.certification.UserCertificationBatDelDO;
import cn.xnh.datacenter.user.model.certification.UserCertificationDelDO;
import cn.xnh.datacenter.user.model.certification.UserCertificationPageQueryDO;
import cn.xnh.datacenter.user.service.UserCertificationService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户认证信息服务实现
 * 
 * @author tangdu
 * @version $: UserCertificationServiceImpl.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
@Service
public class UserCertificationServiceImpl implements UserCertificationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserCertificationServiceImpl.class);

    @Autowired
    private UserCertificationMapper userCertificationMapper;

    /**
     * 根据ID查询用户认证信息信息
	 * 
	 * @param id 用户认证信息ID
	 * @return 用户认证信息信息
     */
    @Override
    public UserCertificationDO queryById(Long id) {
        return this.userCertificationMapper.queryById(id);
    }

    /**
     * 分页查询用户认证信息信息
	 * 
	 * @param pageDO 用户认证信息信息
	 * @return 用户认证信息分页结果
     */
    @Override
    public PageData<UserCertificationDO> pageQuery(UserCertificationPageQueryDO pageDO) {
        PageHelper.startPage(pageDO.getPageNo(), pageDO.getPageSize());
		Page<UserCertificationDO> page = this.userCertificationMapper.queryPage(pageDO);
		PageData<UserCertificationDO> pageData = ObjectUtils.copy(pageDO, PageData.class);
		pageData.setResultList(page.getResult());
		pageData.setTotalPage(page.getPages());
		pageData.setTotalSize((int) page.getTotal());
		return pageData;
    }

    /**
     * 添加用户认证信息信息
	 * 
	 * @param userCertification 用户认证信息信息
	 * @return 用户认证信息记录ID
     */
    @Override
    public Long add(UserCertificationDO userCertification) {
        boolean flag = this.userCertificationMapper.add(userCertification) > 0;
		if (flag) {
			return userCertification.getId();
		}
		return 0L;
    }

    /**
     * 更新用户认证信息信息
	 * 
	 * @param userCertification 用户认证信息更新信息
	 * @return 成功或失败
     */
    @Override
    public boolean updateById(UserCertificationDO userCertification) {
        boolean flag = this.userCertificationMapper.updateById(userCertification) > 0;
		return flag;
    }

    /**
     * 选择更新用户认证信息信息
	 * 
	 * @param userCertification 用户认证信息更新信息
	 * @return 成功或失败
     */
    @Override
    public boolean updateByParams(UserCertificationDO userCertification) {
        boolean flag = this.userCertificationMapper.updateByParams(userCertification) > 0;
		return flag;
    }

    /**
     * 根据ID删除用户认证信息信息
	 * 
	 * @param userCertificationDelDO 用户认证信息删除对象
	 * @return 成功或失败
     */
    @Override
    public boolean deleteById(UserCertificationDelDO userCertificationDelDO) {
        boolean flag = this.userCertificationMapper.deleteById(userCertificationDelDO) > 0;
		return flag;
    }

    /**
     * 根据ID批量删除用户认证信息信息
	 * 
	 * @param userCertificationBatDelDO 用户认证信息删除对象
	 * @return 成功或失败
     */
    @Override
    public boolean batchDeleteById(UserCertificationBatDelDO userCertificationBatDelDO) {
        boolean flag = this.userCertificationMapper.batchDeleteById(userCertificationBatDelDO) > 0;
		return flag;
    }
}