package cn.xnh.datacenter.user.model.user;

import cn.luban.commons.validate.Validate;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 用户批量删除对象
 *
 * @author tangdu
 * @version $: UserDelBatRO.java, v 0.1 2018年01月17日 下午5:30 tangdu Exp $
 */
@Data
public class UserDelBatDO implements Serializable {
    @Validate(minLength = 1)
    private List<Long> ids;

    @Validate(isNotBlank = true)
    private String     updatePerson;
}
