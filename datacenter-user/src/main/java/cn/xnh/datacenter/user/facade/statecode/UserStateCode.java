/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.facade.statecode;

import cn.luban.commons.result.StateCode;

/**
 * 用户登陆信息状态码(从-200开始)
 * 
 * @author tangdu
 * @version $: UserStateCode.java, v 0.1 2018年01月18日 下午18:12 tangdu Exp $ 
 */
public interface UserStateCode {
    StateCode USER_NOT_FOUND = new StateCode(-200,"用户登陆信息数据不存在");
    StateCode USER_ADD_FAIL = new StateCode(-200,"用户登陆信息添加失败");
    StateCode USER_UPT_FAIL = new StateCode(-200,"用户登陆信息更新失败");
    StateCode USER_DEL_FAIL = new StateCode(-200,"用户登陆信息删除失败");
    StateCode USER_ID_NULL = new StateCode(-200,"用户登陆信息ID不可为空");
    StateCode USER_QUERY_FAIL = new StateCode(-200,"用户登陆信息查询失败");
}