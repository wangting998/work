package com.hb.login.pojo;
/**
 * @Description:   用户实体类
 * @Author:
 * @Date: 2021/1/12
 */

public class User {
    private String username; //用户名
    private String password; //密码

    public User(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
