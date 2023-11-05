package com.example.leetcode;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target&&nums[i]<=9){
                    result[index]=i;
                    result[index+1]=j;
                    index++;
                    break;
                }
            }
        }
        return  result;
    }
}
