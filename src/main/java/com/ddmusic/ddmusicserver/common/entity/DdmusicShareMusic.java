package com.ddmusic.ddmusicserver.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户分享的音乐表(DdmusicShareMusic)实体类
 *
 * @author makejava
 * @since 2022-10-17 16:10:10
 */
public class DdmusicShareMusic implements Serializable {
    private static final long serialVersionUID = -18494928460165450L;
    /**
     * 用户分享的音乐表的id
     */
    private Long id;
    /**
     * 歌曲名称
     */
    private String name;
    /**
     * 歌手名称
     */
    private String singer;
    /**
     * 该音乐所在的url地址，可能有多个，百度云url，阿里云url，蓝奏云url
     */
    private String sign;
    /**
     * 对分享的音乐的描述
     */
    private String desc;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
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

