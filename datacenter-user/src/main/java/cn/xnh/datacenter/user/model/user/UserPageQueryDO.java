package cn.xnh.datacenter.user.model.user;

import cn.luban.commons.ro.PageQuery;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户分页查询对象
 *
 * @author tangdu
 * @version $: UserPageQueryDO.java, v 0.1 2018年01月17日 下午6:53 tangdu Exp $
 */
@Setter
@Getter
public class UserPageQueryDO extends PageQuery {

    /** 用户名称 **/
    private String name;
}
