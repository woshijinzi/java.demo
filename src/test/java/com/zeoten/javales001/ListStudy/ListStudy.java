package com.zeoten.javales001.ListStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListStudy {
    // List 主要有两种 ：ArrayList 和LinkedList
    //ArrayList ：内部是使用数组来实现的    指定容量大小
    // LinkedList ：内部使用的是一个双向链表来实现的
    // 创建 ： 无参数构建；有参数构造   1.指定容量大小  2.复制已存在的List来使用
    // 添加 ： 1. 头插  2.尾插  3. 中间插入
    // 删除 ： 1. 头删  2.尾删  3. 中间删除
    // 遍历 ：1. 使用for 循环
    //        2. 使用迭代器 Iterator ，ListIterator
    //        3. 使用迭代器对List进行添加操作、删除操作
    //        4. 迭代器的使用注意事项：在使用迭代器对列表进行操作的时候，原对象补鞥呢发生结构性变化（也就是长度发生变化），否则迭代器操作会抛出异常
    // 底层实现原理以主要JDK源码 ： 内部存储结构、添加/删除/遍历的操作流程
    // 对List 进行排序：冒泡、插入、选择
    private static void StudyArrayListOp(){
       // 创建ArrayList时，如果未指定容量大小，则会默认创建一个数组，大小为10；
        // 第一次调用 add方法时（不是在new的时候），将容量扩充为默认为10（看底层方法，）
        List<Integer > list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //插入
        list.add(0,20);
        //修改
        list.set(1,20);
        //删除
        list.remove(1);
        list.remove(list.size()-1);//删除最后一位
        // 遍历
        //第一种 for循环
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        // 第二种 (1)迭代器
        Iterator<Integer> iterator =list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // (2)
        //for(iterator :list){
        //}

        //如果我们在创建ArrayList时，能预估数据规模，我们就可以指定一个初始容量大小，以减少扩容
        List<Integer> list2 =new ArrayList<>(100);
        addNumberToList(list2,10,1);
        // 数组是有容量大小限制的，当add操作时，如果数组已满，就会引发扩容
        //1. 计算新的容量大小；为原来容量的1.5 倍
        //2. 按新的容量大小创建一个新的数组；
        //3. 将旧的数组里的元素全部复制到新创建的数组中
        //4. 丢弃旧的数组
        System.out.println(list2);
    }
    private static void addNumberToList(List<Integer> list,int count,int number){
        long start =System.currentTimeMillis();
        for(int i=0;i<count;i++){
            list.add(number);
        }
    }

    private static void ListIterator(){
        List<String> list= new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        ListIterator<String> listIterator =list.listIterator();

        System.out.println(listIterator.next());
        System.out.println(listIterator.previousIndex());
        System.out.println(listIterator.previous());
        // 迭代器操作元素的时候
        // Set 和remove 方法和迭代器的状态有关，更新或者删除的上一次调用next和previous方法返回的元素
        // add 只和迭代器的位置相关，在当前迭代器位置之前添加元素

    }

    public static void main(String[] args) {
        StudyArrayListOp();
        ListIterator();
    }
}
