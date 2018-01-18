/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.mapper;

import cn.xnh.datacenter.user.model.UserCertificationDO;
import cn.xnh.datacenter.user.model.certification.UserCertificationBatDelDO;
import cn.xnh.datacenter.user.model.certification.UserCertificationDelDO;
import cn.xnh.datacenter.user.model.certification.UserCertificationPageQueryDO;
import com.github.pagehelper.Page;

/**
 * 用户认证信息Mapper操作类
 * 
 * @author tangdu
 * @version $: UserCertificationMapper.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
public interface UserCertificationMapper {
    /**
     * 根据ID删除用户认证信息信息
	 * 
	 * @param id 用户认证信息ID
	 * @return 影响行
     */
    int deleteRow(Long id);

    /**
     * 根据ID删除用户认证信息信息
	 * 
	 * @param userCertificationDelDO 用户认证信息删除对象
	 * @return 影响行
     */
    int deleteById(UserCertificationDelDO userCertificationDelDO);

    /**
     * 根据ID批量删除用户认证信息信息
	 * 
	 * @param userCertificationBatDelDO 用户认证信息删除对象
	 * @return 影响行
     */
    int batchDeleteById(UserCertificationBatDelDO userCertificationBatDelDO);

    /**
     * 添加用户认证信息信息
	 * 
	 * @param userCertification 用户认证信息信息
	 * @return 影响行数
     */
    int add(UserCertificationDO userCertification);

    /**
     * 根据ID查询用户认证信息信息
	 * 
	 * @param id 用户认证信息ID
	 * @return 用户认证信息信息
     */
    UserCertificationDO queryById(Long id);

    /**
     * 分页查询用户认证信息信息
	 * 
	 * @param userCertificationPageQueryDO 用户认证信息查询对象
	 * @return 用户认证信息分页结果
     */
    Page<UserCertificationDO> queryPage(UserCertificationPageQueryDO userCertificationPageQueryDO);

    /**
     * 更新用户认证信息信息
	 * 
	 * @param userCertification 用户认证信息更新信息
	 * @return 影响行数
     */
    int updateById(UserCertificationDO userCertification);

    /**
     * 选择更新用户认证信息信息
	 * 
	 * @param userCertification 用户认证信息更新信息
	 * @return 影响行数
     */
    int updateByParams(UserCertificationDO userCertification);
}