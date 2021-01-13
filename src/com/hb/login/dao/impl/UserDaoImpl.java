package com.hb.login.dao.impl;

import com.hb.login.dao.UserDao;
import com.hb.login.pojo.User;

import java.util.ArrayList;
/**
 * 这是用户操作的具体实现类(集合)
 *
 * @author
 * @version
 * */
public class UserDaoImpl implements UserDao {
    //创建存储用户实体类对象的集合，定义为公有的
    //因为要被两个方法都用到所以写到成员的位置定义为公共的
    //private static List<User> list = new ArrayList();
    private static ArrayList<User> array = new ArrayList();

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public boolean isLogin(String username, String password) {
        // 遍历集合，获取每一个用户，并判断该用户的用户名和密码是否和传递过来的匹配
        boolean flag = false;

        for (User u : array) {
            if (u.getUsername().equals(username)
                    && u.getPassword().equals(password)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    /**
     * 注册
     *
     * @param user
     */
    @Override
    public void regist(User user) {
        // 把用户信息存储集合
        // ArrayList<User> array = new ArrayList<User>();
        array.add(user);
    }
}
