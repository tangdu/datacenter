/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service.impl;

import cn.xnh.datacenter.user.mapper.UserInfoMapper;
import cn.xnh.datacenter.user.model.UserInfoDO;
import cn.xnh.datacenter.user.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 服务实现方
 * 
 * @author tangdu
 * @version $: UserInfoServiceImpl.java, v 0.1 2018年01月12日 下午13:10 tangdu Exp $ 
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    public UserInfoDO queryById(Long id) {
        return this.userInfoMapper.queryById(id);
    }

    public boolean deleteById(Long id) {
        if(this.userInfoMapper.deleteById(id)>0){return true;}else{return false;}
    }

    public boolean updateByParams(UserInfoDO record) {
        if(this.userInfoMapper.updateByParams(record)>0){return true;}else{return false;}
    }

    public boolean updateById(UserInfoDO record) {
        if(this.userInfoMapper.updateById(record)>0){return true;}else{return false;}
    }

    public boolean add(UserInfoDO record) {
        if(this.userInfoMapper.add(record)>0){return true;}else{return false;}
    }
}