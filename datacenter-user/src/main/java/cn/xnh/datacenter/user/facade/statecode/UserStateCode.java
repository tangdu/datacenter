package cn.xnh.datacenter.user.facade.statecode;

import cn.luban.commons.result.StateCode;

/**
 * -200 用户接口
 *
 * @author tangdu
 * @version $: UserStateCode.java, v 0.1 2018年01月11日 下午9:42 tangdu Exp $
 */
public interface UserStateCode {

    StateCode USER_NOT_FOUND = new StateCode(-200, "用户信息为空");
    StateCode USER_ADD_FAIL  = new StateCode(-201, "用户添加失败");
    StateCode USER_UPT_FAIL  = new StateCode(-202, "用户更新失败");
    StateCode USER_DEL_FAIL  = new StateCode(-203, "用户删除失败");
    StateCode USER_ID_NULL   = new StateCode(-204, "用户ID不可为空");
    StateCode USER_QUERY_FAIL   = new StateCode(-205, "用户查询失败");
    StateCode USER_ACCOUNT_EXISTS   = new StateCode(-206, "用户账号已经存在");
    StateCode USER_INVALID   = new StateCode(-207, "无效用户");
}
