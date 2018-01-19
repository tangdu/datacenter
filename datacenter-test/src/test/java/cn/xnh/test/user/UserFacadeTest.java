package cn.xnh.test.user;

import cn.luban.commons.result.Result;
import cn.luban.commons.ro.PageData;
import cn.xnh.datacenter.user.facade.ro.UserDelRO;
import cn.xnh.datacenter.user.facade.ro.UserPageQueryRO;
import cn.xnh.datacenter.user.facade.ro.UserRO;
import cn.xnh.datacenter.user.facade.service.UserFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * 用户接口测试
 *
 * @author tangdu
 * @version $: UserFacadeTest.java, v 0.1 2018年01月17日 上午7:24 tangdu Exp $
 */
@SuppressWarnings("ALL")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserTestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class UserFacadeTest {

    @Autowired
    private UserFacade userFacade;

    @Test
    public void 用户查询() {
        Result<UserRO> userROResult = userFacade.queryUserById(2L);
        System.out.println(userROResult);
        assertTrue(userROResult.isSuccess());
        assertEquals(java.util.Optional.of(2L), java.util.Optional.of(userROResult.getData().getId()));
    }

    @Test
    public void 用户添加() {
        UserRO userRO = new UserRO();
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
        assertTrue(longResult.isSuccess());
        System.out.println(longResult);
    }

    @Test
    public void 用户分页() {
        UserPageQueryRO userPageQueryRO = new UserPageQueryRO();
        userPageQueryRO.setStatus(2);
        Result<PageData<UserRO>> pageDataResult = userFacade.pageUserQuery(userPageQueryRO);
        assertTrue(pageDataResult.isSuccess());
        System.out.println(pageDataResult);
    }

    @Test
    public void 用户删除() {
        UserDelRO userDelRO = new UserDelRO();
        Result<Boolean> result = userFacade.deleteUserById(userDelRO);
        System.out.println(result);
        assertTrue(result.isSuccess());
        assertTrue(result.getData());
    }

    @Test
    public void 用户更新() {
        UserRO userRO = new UserRO();
        userRO.setId(1L);
        userRO.setEmail("tangdu@163.com");
        Result<Boolean> result = userFacade.updateUserByParams(userRO);
        System.out.println(result);
        assertTrue(result.isSuccess());
        assertTrue(result.getData());
    }

}
