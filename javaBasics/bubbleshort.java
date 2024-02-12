package com.practice.javaBasics;

import java.util.Arrays;

public class bubbleshort {
    public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 12, 1, 6, 3};
        System.out.println(arr.length);
        int num=7;
        bubbleSort(arr,num);
        System.out.println(Arrays.toString(arr));

    }


}
