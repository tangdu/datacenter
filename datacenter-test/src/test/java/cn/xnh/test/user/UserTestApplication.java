package cn.xnh.test.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@ImportResource(locations = {
        "classpath:dubbo/dubbo*.xml"
})
@ComponentScan(basePackages = {
        "cn.xnh.datacenter.user.service"
}
)
@MapperScan(basePackages = {
        "cn.xnh.datacenter.user.mapper"
})
public class UserTestApplication {



}
