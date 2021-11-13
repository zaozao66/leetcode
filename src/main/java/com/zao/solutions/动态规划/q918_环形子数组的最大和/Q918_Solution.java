package com.zao.solutions.动态规划.q918_环形子数组的最大和;

public class Q918_Solution {
    /**
     * 基本思路：
     * 1.找到非环形的最大值
     * 2.找到从右边数每个位置的最大值
     * 3.再次遍历找到两段的最大值和非环形的最大值做比较
     * @param nums
     * @return
     */
    public int maxSubarraySumCircular(int[] nums) {
        int result = nums[0];
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp = Math.max(temp, 0) + nums[i];
            result = Math.max(result, temp);
        }

        int[] totalRight = new int[nums.length];
        totalRight[nums.length-1] = nums[nums.length - 1];
        for (int i = nums.length-2; i >=0; i--) {
            totalRight[i] = totalRight[i+1]+nums[i];
        }
        int[] maxRight = new int[nums.length];
        maxRight[nums.length-1] = nums[nums.length-1];
        for (int i = nums.length-2; i >= 0; i--) {
            maxRight[i] = Math.max(totalRight[i], maxRight[i+1]);
        }
        int temp2 = 0;
        for (int i = 0; i + 2 < nums.length; i++) {
            temp2 += nums[i];
            result = Math.max(result, temp2 + maxRight[i+2]);
        }
        return result;
    }
}
