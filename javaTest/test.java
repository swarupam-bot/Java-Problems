package com.practice.javaTest;

public class test {
    public static void main(String[] args) {

        char[] arr="II LLOOVVEE YYOOUU".toCharArray();
        char temp=' ';
        String newStr="";
        for(char c:arr)
        {
            if(c!=temp)
            {
                temp=c;
                newStr+=c;
            }
        }
        System.out.println(newStr);




    }

}
