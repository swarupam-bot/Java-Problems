package com.practice.javaBasics;

public class longestString {
    static String longest(String names[])
    {
        String longName = null;
        System.out.println(names.length);
        for (int i=0;names.length-2>i;i++)
        {
            if(names[i].length()>names[i+1].length())
            {
                names[i+1]=names[i];
                longName=names[i+1];

            }
            else
            {
                longName= names[i+i];
            }

        }
        return longName;


    }


    public static void main(String[] args) {
       String names[] = { "Geekhhjnknkjnkn", "Geeks", "Geeksfor",
                "GeeksforGeek", "GeeksforGeeks" };

       System.out.println(longest(names));




    }


}
