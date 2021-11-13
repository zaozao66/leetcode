package com.zao.solutions.双指针.q557_反转字符串中的单词3;

public class Q557_Solution {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            s1[i] = new StringBuffer(s1[i]).reverse().toString();
        }
        return String.join(" ", s1);
    }
}
