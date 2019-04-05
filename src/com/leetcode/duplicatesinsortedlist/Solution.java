package com.leetcode.duplicatesinsortedlist;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode next = cur.next;

        return head;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }
