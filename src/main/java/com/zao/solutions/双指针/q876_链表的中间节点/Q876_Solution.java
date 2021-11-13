package com.zao.solutions.双指针.q876_链表的中间节点;



public class Q876_Solution {
    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
            if (fast.next !=null) {
                fast = fast.next;
            } else {
                return slow;
            }
        }
        return slow;
    }
}
