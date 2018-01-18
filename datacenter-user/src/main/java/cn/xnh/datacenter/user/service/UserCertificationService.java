/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service;

import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.model.UserCertificationDO;
import cn.xnh.datacenter.user.model.certification.UserCertificationBatDelDO;
import cn.xnh.datacenter.user.model.certification.UserCertificationDelDO;
import cn.xnh.datacenter.user.model.certification.UserCertificationPageQueryDO;

/**
 * 用户认证信息服务接口
 * 
 * @author tangdu
 * @version $: UserCertificationService.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
public interface UserCertificationService {
    /**
     * 根据ID查询用户认证信信息
	 * 
	 * @param id 用户认证信ID
	 * @return 用户认证信信息
     */
    UserCertificationDO queryById(Long id);

    /**
     * 分页查询用户认证信信息
	 * 
	 * @param pageDO 用户认证信信息
	 * @return 用户认证信分页结果
     */
    PageData<UserCertificationDO> pageQuery(UserCertificationPageQueryDO pageDO);

    /**
     * 添加用户认证信信息
	 * 
	 * @param userCertification 用户认证信信息
	 * @return 用户认证信记录ID
     */
    Long add(UserCertificationDO userCertification);

    /**
     * 更新用户认证信信息
	 * 
	 * @param userCertification 用户认证信更新信息
	 * @return 成功或失败
     */
    boolean updateById(UserCertificationDO userCertification);

    /**
     * 选择更新用户认证信信息
	 * 
	 * @param userCertification 用户认证信更新信息
	 * @return 成功或失败
     */
    boolean updateByParams(UserCertificationDO userCertification);

    /**
     * 根据ID删除用户认证信信息
	 * 
	 * @param userCertificationDelDO 用户认证信删除对象
	 * @return 成功或失败
     */
    boolean deleteById(UserCertificationDelDO userCertificationDelDO);

    /**
     * 根据ID批量删除用户认证信信息
	 * 
	 * @param userCertificationBatDelDO 用户认证信删除对象
	 * @return 成功或失败
     */
    boolean batchDeleteById(UserCertificationBatDelDO userCertificationBatDelDO);
}