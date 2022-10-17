package com.ddmusic.ddmusicserver.common.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * ddmusic用户表(DdmusicUser)实体类
 *
 * @author makejava
 * @since 2022-10-17 16:10:11
 */
public class DdmusicUser implements Serializable {
    private static final long serialVersionUID = -70589305064132774L;
    /**
     * 用户id
     */
    private Long id;
    /**
     * StickPoint用户账户
     */
    private String account;
    /**
     * 图像图片链接地址
     */
    private String avatar;
    /**
     * 用户昵称
     */
    private String nickName;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 密码
     */
    private String password;
    /**
     * 0--女
     * 1--男
     * 2--秘密
     */
    private Integer sex;

    private Date birthday;
    /**
     * 0--正常
     * 1--封禁
     * 2--删除
     */
    private Integer status;
    /**
     * 个人音乐风格标签
     */
    private String personalLabel;
    /**
     * 打赏支付二维码
     */
    private String rewardQrCode;

    private Date createTime;

    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPersonalLabel() {
        return personalLabel;
    }

    public void setPersonalLabel(String personalLabel) {
        this.personalLabel = personalLabel;
    }

    public String getRewardQrCode() {
        return rewardQrCode;
    }

    public void setRewardQrCode(String rewardQrCode) {
        this.rewardQrCode = rewardQrCode;
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

