package cn.xnh.datacenter.user.model.user;

import cn.luban.commons.validate.Validate;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户删除对象
 *
 * @author tangdu
 * @version $: UserDelRO.java, v 0.1 2018年01月17日 下午5:22 tangdu Exp $
 */
@Data
public class UserDelDO implements Serializable {
    @Validate(required = true)
    private Long id;

    @Validate(isNotBlank = true)
    private String updatePerson;
}
