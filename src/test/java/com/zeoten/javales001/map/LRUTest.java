package com.zeoten.javales001.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUTest {
    public static void main(String[] args){
        // LRU :least Recently Used,最近最少使用
        // 缓存 ：缓存热点数据，经常使用的数据
        //缓存的一种淘汰算法
        // 当缓存已满时，在向缓存内添加内容时，删除（淘汰）掉缓存中已存在元素最近最少被使用的那个

        // LinkedHashMap 支持LRU算法
        // LinkedHashMap 具有HashMap 的所有功能  +可保持插入顺序（遍历）
        // HashMap  +双向链表
        // 双向链表 ：head/tail  after/before
        // LinkedHashMap 是有序的
        // 1. 插入顺序： 每次插入元素，将元素放到双向列表的末尾
        // 2. 访问顺序： 每次插入元素/ 获取元素，将插入的元素或者访问的元素放到双向链表的末尾
        LRU<String,String> lru =new LRU();
        lru.put("001","张三");
        lru.put("002","李四");
        lru.put("003","王五");
        lru.put("004","而撒");
        System.out.println(lru);
        System.out.println(lru.get("001"));
        System.out.println(lru);
    }
    static class LRU<K,v> extends LinkedHashMap<K,v> implements Map<K,v> {
        public LRU(){
            super(10,0.75F,true);
        }
    }
}
