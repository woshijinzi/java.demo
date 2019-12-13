package com.zeroten.flow;

import org.testng.annotations.Test;

public class IfElseTest {

    @Test
    public void testIfElse() {
<<<<<<< HEAD
        int n1 =100;
        System.out.println(n1);
        {
            int n2 =200;  //代码块中是可以访问全局变量的，如果在块中再次设置n1  是会报错
            System.out.println(n1);
            {
                System.out.println(n2);//这里的n2是可以访问的
            }
        }
        //在代码块外访问代码块中的变量是会报错的
    }
    @Test
    public void  testIfElse1(){
        int age = 8;
        if (age<7){
            System.out.println("儿童");
        }else if (age < 18){
            System.out.println("少年");
        }else if (age < 41){
            System.out.println("青年");
        }else if (age <60){
            System.out.println("中年");
        }else{
            System.out.println("老年");
        }

    }
=======
    }

>>>>>>> b553459fd1b47787e5d231c8a32a2f03f0739824
}
