/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.model;

import cn.luban.commons.model.BaseDO;
import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

/**
 * (t_user_address)
 * 
 * @author tangdu
 * @version $: UserAddress.java, v 0.1 2018年01月12日 下午13:10 tangdu Exp $ 
 */
@Setter
@Getter
public class UserAddressDO extends BaseDO {
    /****/
    private Long id;

    /**删除状态 0 正常 1 删除**/
    private Integer isDelete;

    /**省**/
    private String province;

    /**城市**/
    private String city;

    /**区：如 厦门 思明区**/
    private String district;

    /**详细地址**/
    private String address;

    /**收件人**/
    private String recipient;

    /**收件人电话**/
    private String phone;

    /**是否默认地址 0 不默认 1 默认**/
    private Integer isDefault;

    /****/
    private Long tUserId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}