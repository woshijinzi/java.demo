package com.zeoten.proxy;

public class User {
    private String name;
    private Integer age;
    public User(String name,Integer age){
        this.name =name;
        this.age =age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    @Override
    public String toString(){
        StringBuilder tmp = new StringBuilder();
        tmp.append("姓名：");
        tmp.append(name);
        tmp.append("年龄");
        tmp.append(age);
        return tmp.toString();


    }
}
