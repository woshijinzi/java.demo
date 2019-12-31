package com.zeoten.javales001.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapSimple {
    public static void main(String[] args) {
        //001 ->{name :张三, age :20}
        //002 ->{name :张三, age :20}
        //003 ->{name :张三, age :20}
        // 特性：
        // 1. 键值不能重复
        // 2. put 方法如果键值已经存在，name就会使用新值替换原先旧值
        // 3. 键值可以是null
        // 4. 值可以是null
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"张三，20");
        map.put(2,"王五，20");
        map.put(3,"李四，20");
        map.put(4,"张八，20");
        String va1 =map.get(1);
        System.out.println(va1);
        for(Map.Entry<Integer,String>entry:map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
