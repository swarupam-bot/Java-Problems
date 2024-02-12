package com.practice.javaBasics;

public class findSecondLargestNum {
    public static void main(String[] args) {
        int[]arr={53,75,12,89,15,34};
        int lar=arr[0];
        int seclar=0;

        for (int i=0;i<arr.length-1;i++)
        {
            if(lar<arr[i]){
                seclar=lar;
                lar=arr[i];

            }
        }
        System.out.println(seclar);
        System.out.println(lar);
    }
}
