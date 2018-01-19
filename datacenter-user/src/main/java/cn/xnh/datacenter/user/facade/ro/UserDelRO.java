/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.facade.ro;

import cn.luban.commons.validate.Validate;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户登陆信息更新RO
 * 
 * @author tangdu
 * @version $: UserDelRO.java, v 0.1 2018年01月19日 下午13:37 tangdu Exp $ 
 */
@Data
public class UserDelRO implements Serializable {
    /** 用户登陆信息Id **/
    @Validate(required = true)
    private Long id;

    /** 变更人 **/
    @Validate(isNotBlank = true)
    private String updatePerson;
}