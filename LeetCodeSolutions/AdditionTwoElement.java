package com.practice.LeetCodeSolutions;

public class AdditionTwoElement {
    public static void main(String[] args) {
        int[] arr = {2, 11, 15, 4, 7, 5, 9, 2};
        int target = 9;
        int[] arr2 = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    arr2[0] = i;
                    arr2[1] = j;
                    break;
                }

            }

        }
        for (int a : arr2) {
            System.out.println(a);
        }


    }

}
