package cn.xnh.test.user;

import cn.luban.commons.result.Result;
import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.facade.service.UserFacade;
import cn.xnh.datacenter.user.model.UserDO;
import cn.xnh.datacenter.user.model.user.UserDelDO;
import cn.xnh.datacenter.user.model.user.UserPageQueryDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * TODO: detail description
 *
 * @author tangdu
 * @version $: UserFacadeTest.java, v 0.1 2018年01月17日 上午7:24 tangdu Exp $
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserTestApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserFacadeTest {

    @Autowired
    private UserFacade userFacade;

    @Test
    public void 测试查询(){
        Result<UserDO> userROResult = userFacade.queryUserById(2L);
        System.out.println(userROResult);
        Assert.assertTrue(userROResult.isSuccess());
        Assert.assertEquals(java.util.Optional.of(2L),java.util.Optional.of(userROResult.getData().getId()));
    }

    @Test
    public void 测试添加(){
        UserDO userRO=new UserDO();
        userRO.setMobilePhone(18516280229L);
        userRO.setOpenidWeixin("2222");
        userRO.setEmail("tangdu.lai.com");
        userRO.setCreatePerson("tangdu");
        userRO.setUpdatePerson("tangdu");
        userRO.setPasswd("123");
        userRO.setLastLogin(new Date());
        userRO.setStatus(1);
        userRO.setCertification(0);
        Result<Long> longResult = userFacade.addUser(userRO);
        Assert.assertTrue(longResult.isSuccess());
        System.out.println(longResult);
    }

    @Test
    public void 测试分页(){
        UserPageQueryDO userPageQueryRO=new UserPageQueryDO();
        userPageQueryRO.setStatus(1);
        Result<PageData<UserDO>> pageDataResult = userFacade.pageQueryUser(userPageQueryRO);
        System.out.println(pageDataResult);
        Assert.assertTrue(pageDataResult.isSuccess());

    }

    @Test
    public void 测试批量删除(){
        UserDelDO userDelDO=new UserDelDO();
        Result<Boolean> result = userFacade.deleteUserById(userDelDO);
        System.out.println(result);
        Assert.assertTrue(result.isSuccess());
        Assert.assertTrue(result.getData());
    }

}
