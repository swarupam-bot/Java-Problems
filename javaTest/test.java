package com.practice.javaTest;

public class test {
        //palindrom
    public static boolean PalindromCheck(String str)
    {
        boolean pal=true;
        char [] newStr=str.toLowerCase().trim().toCharArray();

        for(int i=0;i<newStr.length/2;i++)
        {
            if(newStr[i]!=newStr[newStr.length-i-1])
            {
                pal=false;
                break;

            }
        }

        return pal;
    }

    public static void main(String[] args) {
        String str="madam";

        if(test.PalindromCheck(str))
        {
            System.out.println("this is palindrom");
        }
        else {
            System.out.println("this is not palindrom");
        }
    }
}
