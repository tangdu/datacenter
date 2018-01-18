/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.model.user;

import cn.luban.commons.validate.Validate;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户登陆信息操作DO
 * 
 * @author tangdu
 * @version $: UserDelDO.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
@Setter
@Getter
public class UserDelDO implements Serializable {
    /** 用户登陆信息Id **/
    @Validate(required = true)
    private Long id;

    /** 变更人 **/
    @Validate(isNotBlank = true)
    private String updatePerson;
}