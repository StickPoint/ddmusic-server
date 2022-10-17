package com.ddmusic.ddmusicserver.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (DdmusicFavorite)实体类
 *
 * @author makejava
 * @since 2022-10-17 16:10:09
 */
public class DdmusicFavorite implements Serializable {
    private static final long serialVersionUID = -45090906783720021L;
    /**
     * 我喜欢-id
     */
    private Long id;
    /**
     * 喜欢的：歌手/歌曲/歌单/专辑/电台 名称
     */
    private String name;
    /**
     * 0--歌曲
     * 1--歌手
     * 2--歌单
     * 3--专辑
     * 4--电台
     * 5--待定
     */
    private Integer type;
    /**
     * 标记，歌曲他有各个平台的id等等信息，词条记录存储json
     */
    private String sign;
    /**
     * 0--正常
     * 1--禁用
     * 2--删除
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
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

