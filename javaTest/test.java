package com.practice.javaTest;


public class test {
    public void shortArr(int []arr)
    {
        for (int i =0;i<arr.length-1;i++)
        {
            for (int j=0;j<=i;j++)
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
        String num="23423412312858726234598728734851248";
        char [] arr=num.toCharArray();
        int [] intArr=new int[arr.length];
        int i=0;
        for(char c:arr)
        {//
            i++;
            intArr[i-1]=Character.getNumericValue(c);
        }

        test t=new test();
        t.shortArr(intArr);
        for (int j:intArr)
        {
            System.out.print(" "+j);
        }


    }

}
