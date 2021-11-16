package com.zao.solutions.动态规划.q714_买卖股票的最佳时机含手续费;

/**
 *
 * 模仿一下冷冻期的思路，股票有持股a和不持股b两个状态
 * 一遍通过，还是有通用性的
 */
public class Q714_Solution {
    public int maxProfit(int[] prices, int fee) {
        int a = -prices[0];
        int b = 0;
        int a1, b1;
        for (int i = 1; i < prices.length; i++) {
            a1 = a;
            b1 = b;
            a = Math.max(a1, b1-prices[i]);
            b= Math.max(b1, a + prices[i] -fee);
        }
        return b;
    }
}
