/**
* xnh.com Inc.
* Copyright (c) 2017-2018 All Rights Reserved.
*/
package cn.xnh.datacenter.user.service.impl;

import cn.xnh.datacenter.user.mapper.UserAddressMapper;
import cn.xnh.datacenter.user.model.UserAddressDO;
import cn.xnh.datacenter.user.service.UserAddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 服务实现方
 * 
 * @author tangdu
 * @version $: UserAddressServiceImpl.java, v 0.1 2018年01月12日 下午13:10 tangdu Exp $ 
 */
@Service
public class UserAddressServiceImpl implements UserAddressService {
    @Autowired
    private UserAddressMapper userAddressMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserAddressServiceImpl.class);

    public UserAddressDO queryById(Long id) {
        return this.userAddressMapper.queryById(id);
    }

    public boolean deleteById(Long id) {
        if(this.userAddressMapper.deleteById(id)>0){return true;}else{return false;}
    }

    public boolean updateByParams(UserAddressDO record) {
        if(this.userAddressMapper.updateByParams(record)>0){return true;}else{return false;}
    }

    public boolean updateById(UserAddressDO record) {
        if(this.userAddressMapper.updateById(record)>0){return true;}else{return false;}
    }

    public boolean add(UserAddressDO record) {
        if(this.userAddressMapper.add(record)>0){return true;}else{return false;}
    }
}