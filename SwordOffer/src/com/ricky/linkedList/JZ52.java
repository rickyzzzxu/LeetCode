package com.ricky.linkedList;

public class JZ52 {

    /* 两个链表的第一个公共结点
    描述
输入两个无环的单向链表，找出它们的第一个公共结点，如果没有公共节点则返回空。（注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）

数据范围： n \le 1000n≤1000
要求：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
    public class Solution {
        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
            int len1 = getLength(pHead1);
            int len2 = getLength(pHead2);

            if (len1 > len2) {
                int n = len1 - len2;
                for (int i = 0; i < n; i++) {
                    pHead1 = pHead1.next;
                }
                while (pHead1 != pHead2) {
                    pHead1 = pHead1.next;
                    pHead2 = pHead2.next;
                }
            } else {
                int n = len2 - len1;
                for (int i = 0; i < n; i++) {
                    pHead2 = pHead2.next;
                }
                while (pHead1 != pHead2) {
                    pHead1 = pHead1.next;
                    pHead2 = pHead2.next;
                }
            }
            return pHead1;
        }
        public int getLength(ListNode head) {
            int n = 0;
            while (head != null) {
                n++;
                head = head.next;
            }
            return n;
        }
    }
}
