package com.practice.javaBasics;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        String clearStr= str.replaceAll(" ","").toLowerCase();

        int length=clearStr.length();
        for (int i=0;i<length/2;i++)
        {
            if(clearStr.charAt(i)!=clearStr.charAt(length-i-1))
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "madam ";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}

