package com.zao.solutions.双指针.q567_字符串的排列;

import org.junit.Test;

import java.util.HashMap;

public class Q567_Solution {
    @Test
    public void test() {
        System.out.println(checkInclusion("adc", "dcda"));
    }

    public boolean checkInclusion(String s1, String s2) {
        int s1Len = s1.length();
        HashMap<Character, Integer> s1Map = new HashMap<>();
        for (int i = 0; i < s1Len; i++) {
            if (s1Map.containsKey(s1.charAt(i))) {
                s1Map.put(s1.charAt(i), s1Map.get(s1.charAt(i)) + 1);
            } else {
                s1Map.put(s1.charAt(i), 1);
            }
        }
        int right = 0;
        int left = 0;
        int equLen = s1Len;
        while (right < s2.length()) {
            if (equLen == 0) {
                return true;
            }
            if (s1Map.containsKey(s2.charAt(right)) && s1Map.get(s2.charAt(right))!=0) {
                s1Map.put(s2.charAt(right), s1Map.get(s2.charAt(right)) - 1);
                right++;
                equLen--;
            } else {
                if (left != right) {
                    s1Map.put(s2.charAt(left), s1Map.get(s2.charAt(left)) + 1);
                    left++;
                    equLen++;
                } else {
                    right++;
                    left++;
                }
            }
        }
        return equLen == 0;
    }
}
