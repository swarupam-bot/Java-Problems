package com.practice.javaBasics;

import java.util.Arrays;

public class javaArrayAnagram {
    public static void main(String[] args) {

        String str1="Swarupam ";
        String str2="Swarupam";

        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();

        
        char[] arr1= str1.toCharArray();
        char[] arr2= str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean a=Arrays.equals(arr1,arr2);

        System.out.println(a);



       // System.out.println(str1);

    }
}
