package cn.xnh.datacenter.user.facade.ro;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户对象
 *
 * @author tangdu
 * @version $: UserRO.java, v 0.1 2018年01月11日 下午9:31 tangdu Exp $
 */
@Data
public class UserRO implements Serializable {

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

    /** 创建时间 */
    private Date createTime;

    /** 创建人 */
    private String createPerson;

    /** 修改时间 */
    private Date updateTime;

    /** 更新人 */
    private String updatePerson;

}
