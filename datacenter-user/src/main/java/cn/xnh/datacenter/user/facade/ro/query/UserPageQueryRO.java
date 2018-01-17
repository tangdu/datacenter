package cn.xnh.datacenter.user.facade.ro.query;

import cn.luban.commons.ro.PageQuery;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户分页查询QO
 *
 * @author tangdu
 * @version $: UserPageQueryQO.java, v 0.1 2018年01月16日 下午1:32 tangdu Exp $
 */
@Setter
@Getter
public class UserPageQueryRO extends PageQuery {

    /** 用户名称 **/
    private String userName;
}
