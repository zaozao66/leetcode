package com.zao.solutions.动态规划.q152_乘积最大子数组;

import org.junit.Test;

public class Q152_Solution {

    @Test
    public void test() {
        System.out.println(maxProduct(new int[]{1,2,-1,-2,2,1,-2,1}));
    }
    public int maxProduct(int[] nums) {
        int posMax = 0;
        int negMin = 0;
        if (nums[0] > 0) {
            posMax = nums[0];
        } else {
            negMin = nums[0];
        }
        int result = nums[0];
        int temp;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                posMax = Math.max(posMax*nums[i], nums[i]);
                negMin = negMin * nums[i];
                result = Math.max(posMax, result);
            } else {
                temp = negMin;
                negMin = Math.min(posMax*nums[i], nums[i]);
                posMax = temp * nums[i];
                result = Math.max(posMax, result);
            }
        }
        return result;
    }
}
