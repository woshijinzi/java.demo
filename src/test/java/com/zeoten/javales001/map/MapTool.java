package com.zeoten.javales001.map;

import java.util.*;

public class MapTool {
    public static void main(String[] args) {
        // 两个工具类 ：Arrays,Collections
        int[] intArr ={1,2,3,5,4,0};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        //数组和集合的转换
        //数组到集合的转换，asList方法，如果参数是一个基本数据类型数据，会将数组作为一个元素
        // 集合不能存放基本数据数据类型
        //asList 转换后的集合是不能改变结构的
        List list = Arrays.asList(intArr);
        // 集合-> 数组
        Object[] arr =list.toArray(new Integer[0]);

        List<Integer> list1 =new ArrayList<>();
        list1 =  Collections.nCopies(10,1);// 表示复制10个1
        System.out.println(list1);
    }
}
