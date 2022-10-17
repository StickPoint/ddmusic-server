package com.ddmusic.ddmusicserver.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 权限表(DdmusicSysPermission)实体类
 *
 * @author makejava
 * @since 2022-10-17 16:10:10
 */
public class DdmusicSysPermission implements Serializable {
    private static final long serialVersionUID = 602967328314242352L;

    private Long id;

    private Integer parentId;

    private String name;

    private Integer type;

    private String path;

    private Integer status;

    private Date createTime;

    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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

