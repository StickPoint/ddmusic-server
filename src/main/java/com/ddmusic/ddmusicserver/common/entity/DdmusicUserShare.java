package com.ddmusic.ddmusicserver.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (DdmusicUserShare)实体类
 *
 * @author makejava
 * @since 2022-10-17 16:10:11
 */
public class DdmusicUserShare implements Serializable {
    private static final long serialVersionUID = 739433071348560268L;

    private Long id;

    private Long userId;

    private Long shareId;

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

    public Long getShareId() {
        return shareId;
    }

    public void setShareId(Long shareId) {
        this.shareId = shareId;
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

