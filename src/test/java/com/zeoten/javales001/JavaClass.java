package com.zeoten.javales001;

import org.testng.annotations.Test;

public class JavaClass {
    private static String classField;
    private String field;
    {
        field="实例变量";
        classField="nihao";
    }
    static{
        classField="01";
    }
    public JavaClass(){}

    @Test
    public void test001() {
        System.out.println(field);
        System.out.println(classField);
        System.out.println(JavaClass.classField);
    }
}

