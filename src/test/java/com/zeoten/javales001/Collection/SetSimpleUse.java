package com.zeoten.javales001.Collection;

import java.util.*;

public class SetSimpleUse {
    public static void main(String[] args) {
        //set ，集 ，不能有重复元素，可以有null
        // 可能有序或无序
        // HashSet、TreeSet
        //LinkedHashSet、EnumSet
        //所有的集，都实现了Set接口，而Set 接口继承自Collection
        // 所以我们可以说所有的集都实现了Collection
        // Set 和Collection接口的方法是完全一样的，仅是用于语义上的用途
        HashSet<String> set =new HashSet<>();
        System.out.println(set instanceof Set);
        System.out.println(set instanceof Collection);
        System.out.println(set instanceof List);

        //t添加
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        // 遍历 - for循环  因为set是无序的，同样的索引值取出来的值可能不一样
        // 不能使用for循环
        //遍历 --迭代器
        Iterator<String> iterator =set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // List 有序，指的是安插入顺序来保存元素
        // TreeSet  有序，指的是元素按照一定规则来排序，Comparator接口
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("F");

        //遍历 -for循环 不能使用
        Iterator<String> iterator2 =treeSet.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }


        //如果需要使用HashSet的查找元素的高性能
        //同时又需要按元素插入顺序来排序
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("F");
        Iterator<String> iterator3 =linkedList.iterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
    }
}
