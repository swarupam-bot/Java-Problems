package com.practice.javaBasics;




public class DSARotateArray {


    public static int[] returnRevArray(int[]arr,int start,int end)

    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[]arr={2,3,5,7,8,9};
        int move =1;

        returnRevArray(arr,0, arr.length-1);
        returnRevArray(arr,0,move-1);
        returnRevArray(arr,move, arr.length-1);
        for (int j:arr)
        {
            System.out.print(" "+j);
        }


    }
}
