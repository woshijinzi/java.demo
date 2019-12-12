package com.zeroten.flow;

import org.testng.annotations.Test;

public class TestString {
    @Test
    public void String1(){
        String str1 ="1 ";
        String str2= " hello,this is a string.";
        String str3= new String ("Create String with new ");
        System.out.println(str2);
        System.out.println(str3);
    }
    @Test
    public void String2(){
        String str1= "hello";
        String str2= "hello";
        String str3 = "hello" +"world";
        String str4 =str2+"world";
        String str5= new String("hello");
        String str6 =new String ("hello");
        String str7= str6.intern();
        String str8= new String("hello").intern();
    }

}
