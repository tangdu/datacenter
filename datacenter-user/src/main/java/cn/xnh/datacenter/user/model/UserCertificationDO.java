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
 * 用户认证信息(t_user_certification)
 * 
 * @author tangdu
 * @version $: UserCertification.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
@Setter
@Getter
public class UserCertificationDO extends BaseDO {
    /****/
    private Long id;

    /**认证类型 0 个人 1 企业**/
    private Integer type;

    /**认证结果 0 没有通过 1 认证通过**/
    private Integer verify;

    /**认证状态 0 审核中 1 审核成功 2 审核驳回**/
    private Integer status;

    /****/
    private Long tUserId;

    /**认证的内容 json格式，动态扩展需要的字段**/
    private String datas;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}