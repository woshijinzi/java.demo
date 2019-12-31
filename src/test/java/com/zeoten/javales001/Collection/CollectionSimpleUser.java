package com.zeoten.javales001.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionSimpleUser {
    public static void main(String[] args) {
        //集合分为两大类：
        //1. 单个元素的序列，全部实现了Collection接口
                //1.1 List 列表，有序的按照插入顺序排序，可以有重复的，也可以包含null（多个也可以）
                //1.2 set 集 ，不可以有重复元素，可以有Null值（只能有一个），可以没有顺序
                //1.3 Queue ，队列，按一定规则进行添加、删除
        //2. 键值对，全部都实现了Map接口

        // 可以通过<> 括号来指定列表里要放的元素类型
        List<String> list =new ArrayList<>();
        list.add("A");
        list.add("B");
        System.out.println("List的元素个数" + list.size());

        //遍历 -for循环使用元素索引的方式
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
         //list.remove(1);  //表示索引
        //list.remove("A"); //表示直接删除元素

        //遍历 -使用迭代器的方式
        Iterator<String> iterator=list.iterator();
        //迭代器的位置在元素之间，存在n个元素的列表，迭代器的位置可能存在n+1个
        //获取迭代器后，迭代器的位置在第一个元素之前
        //为调用next（）方法时，调用remove抛出异常
        // remove方法删除的是调用next（）方法时返回的元素（越过的元素）
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        // 当迭代器达到最后一个元素之后时，在调用next（）方法抛出异常
        while(iterator.hasNext()){
            // next 方法有两个作用
            // 将迭代器的位置移至下一个位置
            // t同时返回迭代器中的元素
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
