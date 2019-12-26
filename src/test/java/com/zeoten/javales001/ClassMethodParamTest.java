package com.zeoten.javales001;

import org.testng.annotations.Test;
public class ClassMethodParamTest {
    public int  numb=10;
    public void changePrimitive(int numb){
        System.out.println("传入的值"+ numb);
        numb++;
        System.out.println(numb);
    }

    @Test
    public void testMethode() {
        Test001 test=new Test001();
    }
}
