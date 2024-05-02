package com.practice.javaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findNonRepatingChar {

    public static List<Character> nonRepetingChar(String s)
    {
        char[] ch = s.toCharArray();
        List<Character> chr=new ArrayList<>();

        HashMap<Character, Integer> hmap = new HashMap<>();

        for (int i = 0; i < ch.length; i++) {
            if (hmap.containsKey(ch[i])) {
                hmap.put(ch[i], hmap.get(ch[i]) + 1);
            } else {
                hmap.put(ch[i], 1);
            }
        }
        for (char c : ch) {
            if(hmap.get(c)==1)
            {
                chr.add(c);
            }
        }
        return chr;
    }

    public static void main(String[] args) {

        for (char c:nonRepetingChar("hello"))
        {
            System.out.println(c);
        }


    }
}
