
package cn.xnh.datacenter.user.task;

import cn.xnh.datacenter.user.mapper.UserMapper;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户处理任务处理
 *
 * @author tangdu
 * @version $: UserOverEventJob.java, v 0.1 2018年01月12日 下午2:08 tangdu Exp $
 */
public class UserOverEventJob implements SimpleJob {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserOverEventJob.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public void execute(ShardingContext shardingContext) {
        userMapper.deleteById(1L);
        LOGGER.info("execute UserOverEventJob");
    }
}
