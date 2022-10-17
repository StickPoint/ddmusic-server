package com.ddmusic.ddmusicserver.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 顶点音乐后台日志(DdmusicSysLog)实体类
 *
 * @author makejava
 * @since 2022-10-17 16:10:10
 */
public class DdmusicSysLog implements Serializable {
    private static final long serialVersionUID = -96213264601838549L;
    /**
     * 顶点音乐后台日志id
     */
    private Long id;
    /**
     * 日志名称
     */
    private String name;
    /**
     * 操作系统
     */
    private String os;
    /**
     * 日志创建者
     */
    private String creator;
    /**
     * 操作
     */
    private String action;
    /**
     * 成功，失败
     */
    private String result;

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

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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

