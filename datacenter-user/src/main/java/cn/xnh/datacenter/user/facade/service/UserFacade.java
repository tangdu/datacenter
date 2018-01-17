package cn.xnh.datacenter.user.facade.service;

import cn.luban.commons.result.Result;
import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.facade.ro.UserRO;
import cn.xnh.datacenter.user.facade.ro.query.UserPageQueryRO;

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
    Result<UserRO> queryUserById(Long userId);

    /**
     * 根据用户ID删除用户信息
     *
     * @param userId 用户ID
     * @return
     */
    Result<Boolean> deleteUserById(Long userId);

    /**
     * 添加用户信息
     *
     * @param userRO 用户信息
     * @return 返回用户ID
     */
    Result<Long> addUser(UserRO userRO);

    /**
     * 更新用户信息
     *
     * @param userRO 用户信息
     * @return 返回成功标志
     */
    Result<Boolean> updateUser(UserRO userRO);

    /**
     * 分页查询用户信息
     *
     * @param userPageQueryRO 分页查询用户对象
     * @return
     */
    Result<PageData<UserRO>> pageQueryUser(UserPageQueryRO userPageQueryRO);
}
