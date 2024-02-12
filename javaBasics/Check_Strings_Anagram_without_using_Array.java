package com.practice.javaBasics;

public class Check_Strings_Anagram_without_using_Array {

    public static void main(String[] args) {
        String name="swarupam";
        String name2="swarupam";
        boolean ret=true;


        char [] nameCh=name.toCharArray();
        char [] nameCh2=name2.toCharArray();


        if(nameCh.length==nameCh2.length) {
            for (int i = 0; i < name.length(); i++) {
                if (nameCh[i] != nameCh2[i]) {
                    ret = false;
                }

            }
        }
        else
        {
            ret = false;
        }
        System.out.println(ret);


    }
}
