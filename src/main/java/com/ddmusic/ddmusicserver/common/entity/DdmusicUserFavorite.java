package com.ddmusic.ddmusicserver.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户-喜欢-中间表
 * (DdmusicUserFavorite)实体类
 *
 * @author makejava
 * @since 2022-10-17 16:10:11
 */
public class DdmusicUserFavorite implements Serializable {
    private static final long serialVersionUID = 309434646320715686L;

    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 喜欢-id
     */
    private Long favId;

    private Date createTime;

    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFavId() {
        return favId;
    }

    public void setFavId(Long favId) {
        this.favId = favId;
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

