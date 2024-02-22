package com.practice.LeetCodeSolutions;
public class reverseInteger {

    public static long reverse(int x) {
        StringBuilder str = new StringBuilder(String.valueOf(x));
        str.reverse();
        String str2 = str.toString();
        if (str2.contains("-")) {
            str.deleteCharAt(str2.indexOf("-"));
            str.insert(0, "-");
        }
        long a = Long.parseLong(String.valueOf(str));
        return a;
    }


    public static void main(String[] args) {

        int num = 460;
        System.out.println(reverseInteger.reverse(num));



    }
}
