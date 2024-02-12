package com.practice.javaBasics;

import java.util.HashMap;

public class charCount {

    public static void main(String[] args) {

        String name = "looooooolaaa";

        HashMap<Character,Integer> map=new HashMap<>();

        for(char i:name.toCharArray())
        {
            if(map.containsKey(i))
            {
                map.put(i, map.get(i)+1);
            }
            else
            {
                map.put(i, 1);
            }

        }

   for (char c:map.keySet())
   {
       System.out.println(c+" :"+map.get(c));

   }

    }


}
