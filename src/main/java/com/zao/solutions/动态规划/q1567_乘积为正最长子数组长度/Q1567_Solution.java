package com.zao.solutions.动态规划.q1567_乘积为正最长子数组长度;

import org.junit.Test;

public class Q1567_Solution {
    @Test
    public void test() {
        System.out.println(getMaxLen(new int[]{1,-2,-3,4}));
    }
    public int getMaxLen(int[] nums) {
        int posLen = 0;
        int negLen = 0;
        int result = 0;

        for (int num : nums) {
            if (num > 0) {
                posLen++;
                negLen = negLen == 0 ? 0 : negLen + 1;
                result = Math.max(posLen, result);
            } else if (num < 0) {
                int temp = posLen;
                posLen = negLen == 0 ? 0 : negLen + 1;
                negLen = temp == 0 ? 1 : temp + 1;
                result = Math.max(posLen, result);
            } else {
                posLen = 0;
                negLen = 0;
            }
        }

        return result;
    }
}
