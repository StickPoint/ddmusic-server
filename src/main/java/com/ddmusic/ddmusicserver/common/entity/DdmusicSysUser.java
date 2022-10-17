package com.ddmusic.ddmusicserver.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 后台用户表(DdmusicSysUser)实体类
 *
 * @author makejava
 * @since 2022-10-17 16:10:10
 */
public class DdmusicSysUser implements Serializable {
    private static final long serialVersionUID = -58125493131135168L;

    private Long id;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 0--女
     * 1--男
     */
    private Integer sex;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 邮箱地址
     */
    private String password;

    private Integer status;

    private Date createTime;

    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}

