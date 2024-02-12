package com.practice.javaBasics;

import java.util.HashMap;

public class EncordingString {
    public static void main(String[] args) {
        String str="aababbbcdd";
        String encoValue="";;
        HashMap <Character, Integer> StrHM=new HashMap<>();

        for (char ch:str.toCharArray())
        {
            if(StrHM.containsKey(ch)) {
                StrHM.put(ch, StrHM.get(ch) + 1);
            }
            else
            {
                StrHM.put(ch,1);

            }
            if(StrHM.containsKey(ch)) {
                encoValue+=ch+""+StrHM.get(ch);
            }
            else
            {
                //encoValue+=ch+""+StrHM.get(ch);

            }


        }
        System.out.println(encoValue);

       /* for (char chr:StrHM.keySet())
        {
            encoValue+=chr+""+StrHM.get(chr);
           // System.out.print(chr+""+StrHM.get(chr));
        }

        System.out.println(encoValue);

        */
    }
}
