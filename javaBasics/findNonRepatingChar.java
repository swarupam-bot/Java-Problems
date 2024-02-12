package com.practice.javaBasics;

import java.util.HashMap;

public class findNonRepatingChar {

    public static char nonRepetingChar(String s)
    {
        char[] ch = s.toCharArray();
        char chr = '\0'; // Initialize chr with a default value

        HashMap<Character, Integer> hmap = new HashMap<>();

        for (int i = 0; i < ch.length; i++) {
            if (hmap.containsKey(ch[i])) {
                hmap.put(ch[i], hmap.get(ch[i]) + 1);
            } else {
                hmap.put(ch[i], 1);
            }
        }

        for (char c : ch) {
            System.out.println(c+ "  "+hmap.get(c));
            break;
         //   if (hmap.get(c).equals(1)) {
          //      chr = c;
              //  break; // Exit the loop once the first non-repeating character is found
          //  }
        }

        return chr;

    }

    public static void main(String[] args) {

        System.out.println(nonRepetingChar("hello"));


    }
}
