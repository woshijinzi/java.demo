package com.zeoten.proxy;

public class UserDaoService {
    public static void main(String[] args) {
        User user =new User("张三",20);
        UserDao dao=new UserDaoImp();
        UserDaoProxy proxy = new UserDaoProxy(dao);
        proxy.save(user);
    }
}
