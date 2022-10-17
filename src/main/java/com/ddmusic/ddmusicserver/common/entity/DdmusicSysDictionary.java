package com.ddmusic.ddmusicserver.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 系统数据字典(DdmusicSysDictionary)实体类
 *
 * @author makejava
 * @since 2022-10-17 16:10:10
 */
public class DdmusicSysDictionary implements Serializable {
    private static final long serialVersionUID = -99606675788890031L;

    private Long id;

    private String name;
    /**
     * 字典内容
     */
    private String value;
    /**
     * 0
     * 1
     * 2
     */
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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

