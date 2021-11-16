package com.zao.solutions.动态规划.q309_最佳买卖股票时机含冷冻期;

/**
 *
 * 没做出来，跟着其他人的思路走一遍
 * 股票可以分为三种状态 不持股（没卖出）a、持股 b、不持股（卖出）c
 * 不持股没卖出可以是 a c 状态延续
 * 持股是 a b状态的延续
 * 卖出是 b状态的延续
 *
 * 结果一遍过，有点过于牛了
 */

public class Q309_Solution {
    public int maxProfit(int[] prices) {
        int a =0;
        int b = -prices[0];
        int c = 0;
        int a1, b1, c1;
        for (int i = 1; i < prices.length; i++) {
            a1 = a;
            b1  =b;
            c1 = c;
            a = Math.max(a1, c1);
            b = Math.max(a1 - prices[i], b1);
            c = b1 + prices[i];
        }
        return Math.max(a, Math.max(b,c));
    }
}
