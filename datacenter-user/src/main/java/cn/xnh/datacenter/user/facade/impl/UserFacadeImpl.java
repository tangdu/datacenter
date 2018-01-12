package cn.xnh.datacenter.user.facade.impl;

import cn.luban.commons.object.ObjectUtils;
import cn.luban.commons.result.Result;
import cn.luban.commons.result.Results;
import cn.xnh.datacenter.user.facade.ro.UserRO;
import cn.xnh.datacenter.user.facade.service.UserFacade;
import cn.xnh.datacenter.user.facade.statecode.UserStateCode;
import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户接口服务提供实现方
 *
 * @author tangdu
 * @version $: UserFacadeImpl.java, v 0.1 2018年01月11日 下午9:35 tangdu Exp $
 */
@Service("userFacade")
public class UserFacadeImpl implements UserFacade {
    private static final Logger LOGGER= LoggerFactory.getLogger(UserFacadeImpl.class);
    @Autowired
    private UserService userService;

    @Override
    public Result<UserRO> queryUserById(Long userId) {
        LOGGER.info("queryInfo",userId);
        LOGGER.error("queryError",userId);
        UserDO user = userService.queryById(userId);
        if(user!=null){
            UserRO userRO = ObjectUtils.copy(user, UserRO.class);
            return Results.success(userRO);
        }
        return Results.failed(UserStateCode.USER_NOT_FOUND);
    }
}
