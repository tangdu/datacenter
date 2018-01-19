package cn.xnh.test.user;

import cn.xnh.datacenter.user.facade.ro.UserRO;
import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.Date;

import static com.alibaba.fastjson.serializer.SerializerFeature.WriteDateUseDateFormat;

/**
 * TODO: detail description
 *
 * @author tangdu
 * @version $: SimpleTest.java, v 0.1 2018年01月19日 下午1:22 tangdu Exp $
 */
public class SimpleTest {

    @Test
    public void 测试日期(){
        UserRO r=new UserRO();
        r.setCreateTime(new Date());
        System.out.println(JSON.toJSONString(r,WriteDateUseDateFormat));
    }
}
