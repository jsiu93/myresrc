/*
 * This file is generated by jOOQ.
 */
package com.xzh.myresrc.admin.db.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * 系统用户
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1621555595;

    private Long          userId;
    private String        username;
    private String        password;
    private String        salt;
    private String        email;
    private String        mobile;
    private Integer       status;
    private Long          createUserId;
    private LocalDateTime createTime;

    public SysUser() {}

    public SysUser(SysUser value) {
        this.userId = value.userId;
        this.username = value.username;
        this.password = value.password;
        this.salt = value.salt;
        this.email = value.email;
        this.mobile = value.mobile;
        this.status = value.status;
        this.createUserId = value.createUserId;
        this.createTime = value.createTime;
    }

    public SysUser(
        Long          userId,
        String        username,
        String        password,
        String        salt,
        String        email,
        String        mobile,
        Integer       status,
        Long          createUserId,
        LocalDateTime createTime
    ) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.mobile = mobile;
        this.status = status;
        this.createUserId = createUserId;
        this.createTime = createTime;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return this.salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateUserId() {
        return this.createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SysUser (");

        sb.append(userId);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(salt);
        sb.append(", ").append(email);
        sb.append(", ").append(mobile);
        sb.append(", ").append(status);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(createTime);

        sb.append(")");
        return sb.toString();
    }
}
