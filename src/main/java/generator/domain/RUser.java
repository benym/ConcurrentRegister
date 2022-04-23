package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户注册信息表
 * @TableName r_user
 */
@TableName(value ="r_user")
public class RUser implements Serializable {
    /**
     * 
     */
    @TableId
    private Long id;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户电话
     */
    private String userTelephone;

    /**
     * 用户密码
     */
    private String passWord;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户账号
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 用户账号
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 用户电话
     */
    public String getUserTelephone() {
        return userTelephone;
    }

    /**
     * 用户电话
     */
    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    /**
     * 用户密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 用户密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}