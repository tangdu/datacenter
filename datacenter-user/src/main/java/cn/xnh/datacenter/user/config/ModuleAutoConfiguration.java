package cn.xnh.datacenter.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * 模块配置
 *
 * @author tangdu
 * @version $: ModuleAutoConfiguration.java, v 0.1 2018年01月11日 下午9:49 tangdu Exp $
 */
@Configuration
@ComponentScan(basePackages = {
        "cn.xnh.datacenter.user.facade",
        "cn.xnh.datacenter.user.service"
}
)
@MapperScan(basePackages = {
        "cn.xnh.datacenter.user.mapper"
})
public class ModuleAutoConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(ModuleAutoConfiguration.class);

    @PostConstruct
    public void init() {
        LOGGER.info("Init DataCenter-User-Moudle");
    }
}
