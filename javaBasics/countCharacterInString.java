package com.practice.javaBasics;

import java.util.HashMap;

public class countCharacterInString {
    public static void main(String[] args) {
        String name="swarupam";

        HashMap< Character,Integer> contChar= new HashMap<>();

        for(int i=0;i<name.length();i++)
        {
            char[] c=name.toCharArray();

            if(contChar.containsKey(c[i]))
            {
                contChar.put(c[i],contChar.get(c[i])+1);
            } else {

                contChar.put(c[i],1);
            }

        }

        for (char s:contChar.keySet())
        {
            System.out.println(s+" = "+contChar.get(s));
        }

    }
}
