package com.practice.javaBasics;

public class secBiggestNum {
    public static void main(String[] args) {
        int[] arr = {12, 43, 54, 23, 64, 330};

        int a=arr[0];
        int b=0;

        for(int i:arr)
        {
            if(a<i)
            {
                b=a;
                a=i;




            }
        }

        System.out.println(b+a);


    }
}
