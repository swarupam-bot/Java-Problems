package com.practice.LeetCodeSolutions;

public class RomanToInteger {
    public static int RomanToInt(String str) {
        int number = 0;
        String[] notation = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};


        while(str.length()>0) {
            for (int i = 0; i < notation.length; i++) {
                if (str.startsWith(notation[i])) {
                    number += value[i];
                    str = str.substring(notation[i].length());
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
        String rom="XCII";
        System.out.println(RomanToInt(rom));
    }
}
