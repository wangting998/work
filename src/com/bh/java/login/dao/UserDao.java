package com.bh.java.login.dao;

import com.bh.java.login.pojo.User;

/**
 * @Description:针对用户进行操作的接口
 * @Author:
 * @Date: 2021/1/12
 */

public interface UserDao {
    /**
     * 这是用户登录功能
     *
     * @param username 用户名
     * @param password 密码
     * @return 返回登录是否成功
     */
    public abstract boolean isLogin(String username, String password);

    /**
     * 这是用户注册功能
     *
     * @param user 需注册的用户信息
     */
    public abstract void regist(User user);
}
