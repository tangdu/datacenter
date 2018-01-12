/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service.impl;

import cn.xnh.datacenter.user.mapper.UserMapper;
import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 服务实现方
 * 
 * @author tangdu
 * @version $: UserServiceImpl.java, v 0.1 2018年01月12日 下午13:10 tangdu Exp $ 
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    public UserDO queryById(Long id) {
        return this.userMapper.queryById(id);
    }

    public boolean deleteById(Long id) {
        if(this.userMapper.deleteById(id)>0){return true;}else{return false;}
    }

    public boolean updateByParams(UserDO record) {
        if(this.userMapper.updateByParams(record)>0){return true;}else{return false;}
    }

    public boolean updateById(UserDO record) {
        if(this.userMapper.updateById(record)>0){return true;}else{return false;}
    }

    public boolean add(UserDO record) {
        if(this.userMapper.add(record)>0){return true;}else{return false;}
    }
}