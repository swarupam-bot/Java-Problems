package com.practice.LeetCodeSolutions;

import java.util.HashMap;

public class wordPatternPN260 {
    public static boolean wordPattern(String pattern, String s) {
    String[] words=s.split(" ");
//this is comment

        if(words.length!=pattern.length())
    {
        return false;
    }
    HashMap<Character,String> charToWord=new HashMap<>();
    HashMap<String, Character> wordToChar = new HashMap<>();

        for(int i =0;i< words.length;i++)
    {
        char c=pattern.charAt(i);
        String word=words[i];
        if(!charToWord.containsKey(c))
        {
            if (wordToChar.containsKey(word))
            {
                return false;
            }

            charToWord.put(c,word);
            wordToChar.put(word,c);
        } else if (!charToWord.get(c).equals(word)) {
            return false;
        }


    }
        return true;
}
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog")); // Output: true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // Output: false
        System.out.println(wordPattern("abba", "cat cat cat cat")); // Output: false
    }

}
