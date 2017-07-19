package com.abear.chestnut.config;

/**
 * Created by xyc on 2017/6/15.
 */
public enum UserConfig {

    ADMIN("xxx@qq.com", "xxx"),
    NORMAL("zzz@qq.com", "xxx");

    private String userName;
    private String pwd;

    private UserConfig(String name, String pwd) {
        this.userName = name;
        this.pwd = pwd;
    }

    public String getUserName() { return userName; }

    public void setUserName(String name) { this.userName = name; }

    public String getPwd() { return pwd; }

    public void setPwd(String pwd) { this.pwd = pwd; }

}
