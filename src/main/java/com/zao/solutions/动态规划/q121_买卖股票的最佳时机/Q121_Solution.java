package com.zao.solutions.动态规划.q121_买卖股票的最佳时机;

public class Q121_Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            result=Math.max(result, prices[i] - min);
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return result;
    }
}
