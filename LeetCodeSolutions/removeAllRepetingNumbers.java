package com.practice.LeetCodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class removeAllRepetingNumbers {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 3, 5,6,9, 2, 2};

        // List to store repeated elements
        List<Integer> repeatedElements = new ArrayList<>();
        List<Integer> nonRepeatedElements = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (!repeatedElements.contains(arr[i])) {
                        repeatedElements.add(arr[i]);
                    }
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (!repeatedElements.contains(arr[j])) {
                nonRepeatedElements.add(arr[j]);
            }
        }

        int []newArr= new int[nonRepeatedElements.size()];

        for(int i=0;i<nonRepeatedElements.size();i++)
        {
            newArr[i]= nonRepeatedElements.get(i);

        }
        arr=newArr;






        // Print the repeated elements
        System.out.println("nonRepeated elements:");
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
