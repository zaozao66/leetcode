package com.zao.solutions.动态规划.q55_跳跃游戏;

import org.junit.Test;

public class Q55_Solution {
    @Test
    public void test() {
        canJump(new int[]{3,2,1,0,4});
    }
    public boolean canJump(int[] nums) {
        int left = 0;
        int right = 0;
        while(left <= right && left < nums.length) {
            right = Math.max(right, left + nums[left]);
            if (right >= nums.length -1) {
                return true;
            }
            left++;
        }
        if (right < nums.length -1) {
            return false;
        }
        return true;
    }
}
