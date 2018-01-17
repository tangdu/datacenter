package cn.xnh.datacenter.user.facade.service;

import cn.luban.commons.result.Result;
import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.model.user.UserDelBatDO;
import cn.xnh.datacenter.user.model.user.UserDelDO;
import cn.xnh.datacenter.user.model.user.UserPageQueryDO;

/**
 * 用户基础服务提供方
 *
 * @author tangdu
 * @version $: UserFacade.java, v 0.1 2018年01月11日 下午9:30 tangdu Exp $
 */
public interface UserFacade {

    /**
     * 根据用户ID查询用户信息
     *
     * @param userId 用户ID
     * @return
     */
    Result<UserDO> queryUserById(Long userId);

    /**
     * 根据用户ID删除用户信息
     *
     * @param userDelDO 用户删除对象
     * @return
     */
    Result<Boolean> deleteUserById(UserDelDO userDelDO);

    /**
     * 根据用户ID批量删除用户信息
     *
     * @param userDelBatDO 用户删除对象
     * @return
     */
    Result<Boolean> batchDeleteUserById(UserDelBatDO userDelBatDO);

    /**
     * 添加用户信息
     *
     * @param userDO 用户信息
     * @return 返回用户ID
     */
    Result<Long> addUser(UserDO userDO);

    /**
     * 更新用户信息
     *
     * @param userDO 用户信息
     * @return 返回成功标志
     */
    Result<Boolean> updateUser(UserDO userDO);

    /**
     * 分页查询用户信息
     *
     * @param userPageQueryDO 分页查询用户对象
     * @return
     */
    Result<PageData<UserDO>> pageQueryUser(UserPageQueryDO userPageQueryDO);
}
