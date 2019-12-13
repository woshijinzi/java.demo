package com.zeroten.flow;

import org.testng.annotations.Test;

public class String1 {
    @Test
    public void testString1() {
        String str1="hello";
        String str2 = "hello";
        String  str3= "hello" + "world";
        String str4 =str2+ "world";
        String str5=new String("hello");
        String str6 =new String("hello");
        String str7 =str6.intern();
        String str8 =new String("hello").intern();

        System.out.println(str1==str2);
        System.out.println(str3==str4);//因为str3在字符串常量池   str4在堆中
        System.out.println(str1==str5);//str5 在堆中创建该字符
        System.out.println(str5==str6);//虽然都在堆中但都是独立的地址
        System.out.println(str1==str7);//因为调用intern（）方法，在字符串常量池中查询
        System.out.println(str1==str8);//因为调用了intern（）方法，只要调用，就会在常量池中查找

    }

    @Test
    public void testString2() {
        String str="hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
        System.out.println(str);
    }
}
