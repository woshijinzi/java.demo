package com.zeroten.flow;

import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArrayTest {
    @Test
    public void testarray1() {
        Integer[] arr1={1,2,3,4};
        for (int index=0;index<arr1.length;index++){
            System.out.println(arr1[index]);
        }
        int[] arr2={4,5,6,7};
        Arrays.asList(arr2).forEach(numb -> System.out.println(numb));//所以 Arrays.asList(Integer[]) 时，是把 Integer 数组的每一个元素作为 List 的元素
       // 而 Arrays.asList(int[]) 时，是把 int[] 数组整个作为一个元素
        for (int nub : arr1){
            System.out.println(nub);
        }
    }

}
