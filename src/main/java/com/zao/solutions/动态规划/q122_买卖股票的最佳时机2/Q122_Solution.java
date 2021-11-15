package com.zao.solutions.动态规划.q122_买卖股票的最佳时机2;

public class Q122_Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < max) {
                res = res + max -min;
                max = prices[i];
                min = prices[i];
            } else {
                max = prices[i];
            }
        }
        return res + max -min;
    }
}
