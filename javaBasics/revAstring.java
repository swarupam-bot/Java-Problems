package com.practice.javaBasics;

public class revAstring {
    public static void main(String[] args) {
        String name="SWARUPAM";

        StringBuilder str =new StringBuilder(name);

        System.out.println(str.reverse());

       for(int i=name.length();i>0;i--)
       {
           System.out.print(name.charAt(i-1));
       }
    }
}
