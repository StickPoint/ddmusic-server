package com.ddmusic.ddmusicserver.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色表(DdmusicSysRole)实体类
 *
 * @author makejava
 * @since 2022-10-17 16:10:10
 */
public class DdmusicSysRole implements Serializable {
    private static final long serialVersionUID = -30812378785383909L;

    private Long id;

    private String name;

    private String desc;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

