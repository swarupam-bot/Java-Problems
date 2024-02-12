package com.practice.javaBasics;

public class CheckArrayShorted {

    public static boolean arrShorted(int[] arr,int length)
    {
        boolean a=true;
        for(int i=0;i< length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                a=false;
                break;
            }
        }
        return a;

    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        boolean b=arrShorted(arr,4);

        System.out.println(b);

    }
}
