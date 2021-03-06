package com.wds.springVideo.entity;

import java.util.Date;

/**
 * user
 * 
 * @author bianj
 * @version 1.0.0 2021-01-23
 */
public class User implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -1710302790083201851L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** uid */
    private Integer id;

    /** email */
    private String email;

    /** password */
    private String password;

    /** vipFlag */
    private Integer vipFlag;

    /** createTime */
    private Date createTime;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取uid
     * 
     * @return uid
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置uid
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取email
     * 
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 设置email
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取password
     * 
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 设置password
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取vipFlag
     * 
     * @return vipFlag
     */
    public Integer getVipFlag() {
        return this.vipFlag;
    }

    /**
     * 设置vipFlag
     * 
     * @param vipFlag
     */
    public void setVipFlag(Integer vipFlag) {
        this.vipFlag = vipFlag;
    }

    /**
     * 获取createTime
     * 
     * @return createTime
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置createTime
     * 
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* This code was generated by TableGo tools, mark 2 end. */

    @Override
    public String toString() {
        return "User{" +
                "uid=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", vipFlag=" + vipFlag +
                ", createTime=" + createTime +
                '}';
    }
}