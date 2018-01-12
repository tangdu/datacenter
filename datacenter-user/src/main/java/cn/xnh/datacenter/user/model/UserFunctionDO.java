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
 * (t_user_function)
 * 
 * @author tangdu
 * @version $: UserFunction.java, v 0.1 2018年01月12日 下午13:10 tangdu Exp $ 
 */
@Setter
@Getter
public class UserFunctionDO extends BaseDO {
    /****/
    private Long id;

    /****/
    private Integer isDelete;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}