package com.zao.solutions.动态规划.q53_最大子序和;

public class Q53_Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp = Math.max(nums[i], temp+nums[i]);
            result = Math.max(result, temp);
        }
        return result;
    }

}
