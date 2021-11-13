package com.zao.solutions.双指针.q19_删除链表的倒数第N个结点;

public class Q19_Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            if (count < n) {
                count++;
            } else {
                slow = slow.next;
            }
        }
        if (count < n) {
            return head.next;
        } else {
            slow.next = slow.next.next;
        }
        return head;
    }
}
