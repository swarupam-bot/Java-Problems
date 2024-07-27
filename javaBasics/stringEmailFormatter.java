package com.practice.javaBasics;

public class stringEmailFormatter {
    public static String EmailFormatter(String str)
    {
        String LowerCaseStr=str.toLowerCase().trim();
        StringBuilder EmailStr=new StringBuilder();

        for (char c:LowerCaseStr.toCharArray())
        {
            if(c!=' ')
            {
                EmailStr.append(c);
            }
        }
        return EmailStr.toString();
    }

    public static void main(String[] args) {
        String email="SWArupam kumar123@gmail.com  ";
        System.out.println(stringEmailFormatter.EmailFormatter(email));
    }
}
