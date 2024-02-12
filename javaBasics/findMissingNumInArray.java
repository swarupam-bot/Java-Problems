package com.practice.javaBasics;

public class findMissingNumInArray {
    public static int  missingNumber(int array[], int n){
        int difference=array[1]-array[0];

        for (int i=1;i<n;i++)
        {
            if(array[i]-array[i-1]!=difference)
            {
                return array[i-1]+difference;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr={1,3,4,5};

        int missNum=missingNumber(arr,5);

        System.out.println(missNum);

    }
}
