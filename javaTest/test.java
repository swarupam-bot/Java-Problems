package com.practice.javaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {


    public static void main(String[] args) {

        int []arr={1,3,4,2,4,2,3,1,5,6};
        int k=0;

        Arrays.sort(arr);

        List<Integer> newList=new ArrayList<>();

        for(int i:arr)
        {

            if(newList.contains(i))
            {
                continue;
            }
            else
            {
                k++;
                newList.add(i);
            }
            arr[k]= newList.get(k);
        }
        for(int j:arr)
        {
            System.out.print(" "+j);
        }



    }

}
