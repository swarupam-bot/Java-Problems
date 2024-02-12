package com.practice.javaBasics;


public class ReverseAString {
    public static void main(String[] args) {
        String name = "My name is swarupam";
        String[] arrName = name.split(" ");
        int length = arrName.length;
        String[] reverse = new String[length];

        for (int i = length - 1; i >= 0; i--) {
            reverse[length - 1 - i] = arrName[i];
        }

        for (String word : reverse) {
            System.out.print(word + " ");
        }


    }
}
