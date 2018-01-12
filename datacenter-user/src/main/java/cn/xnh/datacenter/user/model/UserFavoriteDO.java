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
 * (t_user_favorite)
 * 
 * @author tangdu
 * @version $: UserFavorite.java, v 0.1 2018年01月12日 下午13:10 tangdu Exp $ 
 */
@Setter
@Getter
public class UserFavoriteDO extends BaseDO {
    /****/
    private Long id;

    /**删除状态 0 正常 1 删除**/
    private Integer isDelete;

    /****/
    private Long tUserId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}