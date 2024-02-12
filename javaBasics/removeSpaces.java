package com.practice.javaBasics;

import java.util.Arrays;

public class removeSpaces {
    public static void main(String[] args) {
        String intro="My name is swarupam";

        String[] remIntro=intro.split(" ");

        for (int i=0;i<remIntro.length;i++){
            //System.out.print(remIntro[i]);
        }
        System.out.println();

        int []arr={12,43,53,23,15};

        for (int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));



    }
}
