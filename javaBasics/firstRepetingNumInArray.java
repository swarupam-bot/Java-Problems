package com.practice.javaBasics;

import java.util.HashMap;

public class firstRepetingNumInArray {
    public static void main(String[] args) {
        int []arr={2,4,6,6,8,8,9};

        HashMap<Integer, Integer> hmap=new HashMap<>();

        for (int i:arr)
        {
            if(hmap.containsKey(i))
            {
                hmap.put(i, hmap.get(i)+1);
            }
            else
            {
                hmap.put(i,1);
            }
        }

        for(int j: hmap.keySet())
        {
            if(hmap.get(j).equals(1))
            {
                System.out.println(hmap.get(j));
                break;
            }
        }

    }
}
