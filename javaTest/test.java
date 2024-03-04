package com.practice.javaTest;

public class test {
    public static boolean isVailedParenthesis(String str)
    {
        return true;

    }

    public static void main(String[] args) {

        String newStr="(){]";
        String str="(){}[]";
        for(int i=0;i<str.length();i+=2)
        {


            System.out.println(str.charAt(i)+" "+str.charAt(i+1));
        }
        System.out.println(" ");










    }

}
