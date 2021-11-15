package com.zao.solutions.动态规划.q1014_最佳观光组合;

public class Q1014_Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int first = values[0];
        int result = 0;
        for (int i = 1; i < values.length; i++) {
            result = Math.max(result, values[i] +first - 1);
            first = Math.max(first - 1, values[i]);
        }
        return result;
    }
}
