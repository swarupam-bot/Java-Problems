package com.practice.javaBasics;

import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "bbssopqrs";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        for (char c : charCountMap.keySet()) {
            System.out.println(c + "=" + charCountMap.get(c));
        }
    }
}

