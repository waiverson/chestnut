package com.eisoo.dcos.lae.config;

/**
 * Created by xyc on 2017/6/15.
 */
public enum LaeUserConfig {

    ADMIN("438898806@qq.com", "123456@a"),
    NORMAL("695595403@qq.com", "123456@a");

    private String userName;
    private String pwd;

    private LaeUserConfig(String name, String pwd) {
        this.userName = name;
        this.pwd = pwd;
    }

    public String getUserName() { return userName; }

    public void setUserName(String name) { this.userName = name; }

    public String getPwd() { return pwd; }

    public void setPwd(String pwd) { this.pwd = pwd; }

}
