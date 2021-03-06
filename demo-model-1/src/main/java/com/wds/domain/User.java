package com.wds.domain;

public class User {

    private Integer uid;
    private String uname;
    private String upassword;

    public User() {
    }
    public User(Integer uid, String uname, String upass) {
        this.uid = uid;
        this.uname = uname;
        this.upassword = upass;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upass='" + upassword + '\'' +
                '}';
    }

    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getUpassword() {
        return upassword;
    }
    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }
}
