package cn.xnh.datacenter.user.facade.service;

import cn.luban.commons.result.Result;
import cn.xnh.datacenter.user.facade.ro.UserRO;

/**
 * 用户基础服务提供方
 *
 * @author tangdu
 * @version $: UserFacade.java, v 0.1 2018年01月11日 下午9:30 tangdu Exp $
 */
public interface UserFacade {

    /**
     * 根据用户ID查询用户信息
     * @param userId 用户ID
     * @return
     */
    Result<UserRO> queryUserById(Long userId);
}
