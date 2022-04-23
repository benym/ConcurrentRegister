package com.benym.concurrentregister.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Time : 2022/4/23 15:58
 */
@Data
@TableName("r_user")
public class UserDO implements Serializable {

    private static final long serialVersionUID = 3477910736582059714L;

    /**
     * 用户id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String Id;

    /**
     * 用户账号
     */
    @TableField("user_account")
    private String account;

    /**
     * 用户电话
     */
    @TableField("user_telephone")
    private String telePhone;

    /**
     * 用户密码
     */
    @TableField("pass_word")
    private String passWord;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("uptate_time")
    private LocalDateTime updateTime;
}
