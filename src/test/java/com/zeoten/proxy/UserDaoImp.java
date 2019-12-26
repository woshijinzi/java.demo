package com.zeoten.proxy;

public class UserDaoImp implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("保存用户信息" + user.toString());
}
}
