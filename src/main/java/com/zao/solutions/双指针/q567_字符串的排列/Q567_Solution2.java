package com.zao.solutions.双指针.q567_字符串的排列;

import org.junit.Test;

import java.util.Arrays;

public class Q567_Solution2 {
    @Test
    public void test() {
        System.out.println(checkInclusion("ab", "a"));
    }
    /**
     *
     * 自己实现的方法过low
     * 按照滑动窗口的方式再来一遍
     * @param s1
     * @param s2
     * @return
     */
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        int[] s1Arrays = new int[26];
        int[] s2Arrays = new int[26];
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            s1Arrays[s1.charAt(i) - 'a']++;
            s2Arrays[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s1Arrays, s2Arrays)) {
            return true;
        }
        for (int i = n; i < s2.length(); i++) {
            s2Arrays[s2.charAt(i) - 'a']++;
            s2Arrays[s2.charAt(i-n) - 'a']--;
            if (Arrays.equals(s1Arrays, s2Arrays)) {
                return true;
            }
        }
        return false;
    }
}
