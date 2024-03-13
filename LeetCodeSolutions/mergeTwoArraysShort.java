package com.practice.LeetCodeSolutions;
public class mergeTwoArraysShort {
    public static int [] MergeTwoArrays(int [] arr1,int [] arr2)
    {
        int [] finalArr=new int[arr1.length+arr2.length];
        for(int j=0;j<arr1.length;j++)
        {
            finalArr[j]=arr1[j];
            finalArr[arr1.length+j]=arr2[j];
        }
        for(int i=0;i<finalArr.length;i++)
        {
            for (int j=0;j<i;j++)
            {
                if(finalArr[j]>finalArr[j+1])
                {
                    int temp=finalArr[j+1];
                    finalArr[j+1]=finalArr[j];
                    finalArr[j]=temp;
                }
            }
        }

        return finalArr;

    }

    public static void main(String[] args) {

        int [] arr1={1,2,3,4};
        int [] arr2={1,2,2,4};

        for (int k: mergeTwoArraysShort.MergeTwoArrays(arr1,arr2))
        {
            System.out.print(k);
        }

    }
}
