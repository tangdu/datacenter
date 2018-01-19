/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.model;

import cn.luban.commons.model.BaseDO;
import com.alibaba.fastjson.JSON;
import java.util.Date;
import lombok.Data;

/**
 * 用户登陆信息(t_user)
 * 
 * @author tangdu
 * @version $: UserDO.java, v 0.1 2018年01月19日 下午13:37 tangdu Exp $ 
 */
@Data
public class UserDO extends BaseDO {
    /****/
    private Long id;

    /**手机，同时作为登陆id**/
    private Long mobilePhone;

    /**用户邮箱**/
    private String email;

    /**用户登陆密码**/
    private String passwd;

    /**用户状态 0 正常 1 冻结**/
    private Integer status;

    /**微信登陆openid**/
    private String openidWeixin;

    /**最后登陆时间**/
    private Date lastLogin;

    /**实名认证情况 0 未认证 1 个人 2 企业**/
    private Integer certification;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}