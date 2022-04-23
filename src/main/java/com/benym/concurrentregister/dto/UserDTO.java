package com.benym.concurrentregister.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @Time : 2022/4/23 16:10
 */
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 4558366741537718813L;

    /**
     * 用户id
     */
    private String Id;

    /**
     * 用户账号
     */
    @NotBlank(message = "账号不能为空")
    private String account;

    /**
     * 用户电话
     */
    @NotBlank(message = "用户电话不能为空")
    private String telePhone;

    /**
     * 用户密码
     */
    @NotBlank(message = "用户密码不能为空")
    private String passWord;
}
