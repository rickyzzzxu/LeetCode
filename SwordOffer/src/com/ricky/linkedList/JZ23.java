package com.ricky.linkedList;

public class JZ23 {
    /*链表中环的入口结点
    描述
给一个长度为n链表，若其中包含环，请找出该链表的环的入口结点，否则，返回null。
数据范围： n\le10000n≤10000，1<=结点值<=100001<=结点值<=10000
要求：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
    public class Solution {

        public ListNode EntryNodeOfLoop(ListNode pHead) {
            if(pHead == null || pHead.next == null){
                return null;
            }

            ListNode fast = pHead;
            ListNode slow = pHead;
            boolean flag = false;
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                return null;
            }else{
                int n = 1;
                fast = fast.next;
                while(fast != slow){
                    fast = fast.next;
                    n++;
                }

                fast = pHead;
                slow = pHead;
                for(int i = 0; i < n; i++){
                    fast = fast.next;
                }
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
            }

            return fast;
        }
    }

}
