package com.practice.LeetCodeSolutions;

public class searchInsert {

    public static int searchInsert(int[] nums, int target) {

        int j=0;
        for(int i=0;i< nums.length-1;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            else if(nums[i]<target && nums[i+1]>=target)
            {
                j=i+1;

            } else if (nums[nums.length-1]<target) {
                j=i+2;
            }

        }
        return j;

        /*
        *   public int searchInsert(int[] nums, int target) {

      int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return left;

    }
        * */

    }
    public static void main(String[] args) {
        int [] arr={2,4,5};
        System.out.println(searchInsert(arr,70));

    }
}
