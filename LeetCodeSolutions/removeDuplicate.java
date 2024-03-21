package com.practice.LeetCodeSolutions;

public class removeDuplicate {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;

        int size=1;

        for(int i=1;i< nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[size++]=nums[i];
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5}; // Input array

        System.out.println("old array : ");
        for(int i:nums)
        {
            System.out.print(" "+i);
        }

        removeDuplicates(nums);
        System.out.println();
        System.out.println("new array : ");
        for(int j:nums)
        {
            System.out.print(" "+j);
        }

    }
}
