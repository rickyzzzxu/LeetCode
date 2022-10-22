package com.ricky.linkedList;

public class JZ25 {

    /*合并两个排序的链表
    描述
输入两个递增的链表，单个链表的长度为n，合并这两个链表并使新链表中的节点仍然是递增排序的。
数据范围： 0 \le n \le 10000≤n≤1000，-1000 \le 节点值 \le 1000−1000≤节点值≤1000
要求：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)

如输入{1,3,5},{2,4,6}时，合并后的链表为{1,2,3,4,5,6}，所以对应的输出为{1,2,3,4,5,6}
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
    public class Solution {
        public ListNode Merge(ListNode list1, ListNode list2) {
            ListNode head = new ListNode(0);
            ListNode pre = head;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    pre.next =  list1;
                    list1 = list1.next;
                } else {
                    pre.next = list2;
                    list2 = list2.next;
                }
                pre = pre.next;
            }

            if (list1 != null) {
                pre.next = list1;
            }

            if (list2 != null) {
                pre.next = list2;
            }

            return head.next;
        }
    }

}
