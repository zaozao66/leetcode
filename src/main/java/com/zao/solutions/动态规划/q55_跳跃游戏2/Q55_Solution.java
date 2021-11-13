package com.zao.solutions.动态规划.q55_跳跃游戏2;

public class Q55_Solution {
    public int jump(int[] nums) {
        int time = 0;
        int maxRight = 0;
        int left =0;
        while (maxRight < nums.length - 1) {
            int right = maxRight;
            while (left <= maxRight) {
                right = Math.max(right, left + nums[left]);
                left++;
            }
            maxRight = right;
            time++;
        }
        return time;
    }
}
