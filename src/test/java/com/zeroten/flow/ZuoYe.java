
package com.zeroten.flow;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ZuoYe {
    @Test
    public void ZuoYe1(){
        int [] targetArray=new int [4];
        int [] contrastArray=new int[4];
        int [] RepeatArray ={};
        int sum=0;
        for(int i=10;i<100;i++){
            for(int j=i;j<100;j++){
                sum=i*j;
                if(sum >9999){
                    continue;
                }
                targetArray[0]=i/10;
                targetArray[1]=i%10;
                targetArray[2]=j/10;
                targetArray[3]=j%10;
                Arrays.sort(targetArray);
                contrastArray[0]=sum/1000;
                contrastArray[1]=(sum%1000)/100;
                contrastArray[2]=(sum%100)/10;
                contrastArray[3]=sum%10;
                Arrays.sort(contrastArray);
                if(Arrays.equals(targetArray,contrastArray)){
                    System.out.println(i+"*"+j +"=" + sum);

                }
            }
        }
    }
}
