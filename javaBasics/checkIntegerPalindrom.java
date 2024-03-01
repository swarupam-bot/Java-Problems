package com.practice.javaBasics;

public class checkIntegerPalindrom {
    public static void main(String[] args) {

        boolean isPalindrom=true;
        int num=1211210;

        char [] chr=Integer.toString(num).toCharArray();

        for(int i =0;i< chr.length;i++)
        {
            if(chr[i]!=chr[chr.length-1-i])
            {
                isPalindrom=false;
            }
        }

        if(isPalindrom)
        {
            System.out.println("this is a palindrom");

        }
        else
        {
            System.out.println("this is not palindrom");
        }


    }

}
