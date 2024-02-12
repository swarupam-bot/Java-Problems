package com.practice.javaBasics;

import java.util.HashMap;
import java.util.Scanner;

public class CheckVowelCount {

            public static void main(String[] args) {
          char []vowel={'a','e','i','o','u'};
            String name="swarupafjosfln hv3hfowjeofjfwqjofjqlknfniwqebfqbfm ksf84hijwemnsfm";
            char [] arr=name.toCharArray();

           int sum=0;

                HashMap<Character,Integer> count=new HashMap<>();

            for (char c:arr) {

                if(count.containsKey(c))
                {
                    count.put(c,count.get(c)+1);
                }
                else
                {
                    count.put(c,1);
                }

            }

            for(char k:count.keySet())
            {

               for(char m:vowel)
               {
                   if(m==k)
                   {
                       System.out.println(k+"  "+count.get(k));

                       sum+=count.get(k);

                   }
               }




            }
                System.out.println("sum of all vowels :"+sum);

            }
        }




