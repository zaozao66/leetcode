package com.zao.solutions.双指针.q344_反转字符串;

public class Q344_Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length -1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
