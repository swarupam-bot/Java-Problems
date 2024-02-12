package com.practice.javaBasics;

public class RegExpressionMatch {
    public boolean isMatch(String s, String p) {
        int i=s.length();
        int j=p.length();

        if(i==j)
        {
            return true;

        }
        return false;

    }

    public static void main(String[] args) {
        RegExpressionMatch obj=new RegExpressionMatch();
       Boolean match= obj.isMatch("a","re");
        System.out.println("reg expression is match or not :"+ match);

    }
}
