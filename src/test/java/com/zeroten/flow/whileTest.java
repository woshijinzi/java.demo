package com.zeroten.flow;

import org.testng.annotations.Test;

import java.util.Random;

public class whileTest {
    @Test
    public void  testWhile(){
        boolean flag =true;
        int times = 0;
        while (flag){
            int r =new Random().nextInt(1000);
            if (r % 30 ==0){
                flag =false;
                System.out.println(r+" 能被30整除");
            }else {
                System.out.println(r +"不能被30整除");
                times++;
            }
        }
        System.out.println(times);
    }
    @Test
    public void testDoWhile(){
        boolean flag =true;
        int times=0;
        do{
            int r =new Random().nextInt(1000);
            if (r %30 ==0){
                System.out.println(r+"能被整除");
                flag= false;
            }else {
                System.out.println(r+"不能被整除");
                times++;
            }
        }while (flag);
    }
}
