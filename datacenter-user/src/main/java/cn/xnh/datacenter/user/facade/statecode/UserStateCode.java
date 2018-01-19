/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.facade.statecode;

import cn.luban.commons.result.StateCode;

/**
 * 用户登陆信息状态码,从200开始(此code全局不可重复)
 * 
 * @author tangdu
 * @version $: UserStateCode.java, v 0.1 2018年01月19日 下午13:37 tangdu Exp $ 
 */
public interface UserStateCode {
    StateCode USERDO_NOT_FOUND = new StateCode(-201,"用户登陆信息数据不存在");
    StateCode USERDO_ADD_FAIL = new StateCode(-202,"用户登陆信息添加失败");
    StateCode USERDO_UPT_FAIL = new StateCode(-203,"用户登陆信息更新失败");
    StateCode USERDO_DEL_FAIL = new StateCode(-204,"用户登陆信息删除失败");
    StateCode USERDO_ID_NULL = new StateCode(-205,"用户登陆信息ID不可为空");
    StateCode USERDO_QUERY_FAIL = new StateCode(-206,"用户登陆信息查询失败");
}