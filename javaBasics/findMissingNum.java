package com.practice.javaBasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findMissingNum {
    public static void main(String[] args) {

        int [] arr={1,2,4,7,10};
        List<Integer> lis=new ArrayList<>();
        HashSet<Integer> Hset=new HashSet<>();


            for (int a:arr)
            {
                lis.add(a);
            }

            for (int i =1;i<arr[arr.length-1]+1;i++)
            {
                if(!lis.contains(i))
                {
                    Hset.add(i);

                }

            }

            for (int i:Hset)
            {
                System.out.println(i);
            }


    }
}
