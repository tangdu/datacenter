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
 * 用户信息(t_user_info)
 * 
 * @author tangdu
 * @version $: UserInfo.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
@Setter
@Getter
public class UserInfoDO extends BaseDO {
    /****/
    private Long id;

    /**性别 0 保密 1 女性 2 男性**/
    private Integer sex;

    /**用户名**/
    private String username;

    /**昵称**/
    private String nickname;

    /**根据定位获得的地址。eg：福建 厦门**/
    private String addr;

    /**自我介绍**/
    private String intro;

    /****/
    private Long tUserId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}