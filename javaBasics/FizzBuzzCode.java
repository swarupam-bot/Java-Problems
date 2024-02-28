package com.practice.javaBasics;

public class FizzBuzzCode {
    public static void retFizzBuzz(int num)
    {
        for(int i =1;i<num;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println(" FizzBuzz "+i);
                continue;
            }
            if(i%3==0)
            {
                System.out.println(" Fizzz "+i);
            }
            if(i%5==0)
            {
                System.out.println(" Buzzz "+i);
            }

        }
    }

    public static void main(String[] args) {
        retFizzBuzz(100);
    }
}
