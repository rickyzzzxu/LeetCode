package com.ricky.linkedList;

import java.util.ArrayList;

public class JZ6 {
    /**描述
     输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
     示例1
     输入：
     {1,2,3}
     返回值：
     [3,2,1]
     *    public class ListNode {
     *        int val;
     *        ListNode next = null;
     *
     *        ListNode(int val) {
     *            this.val = val;
     *        }
     *    }
     *
     */
import java.util.ArrayList;
    public class Solution {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList<Integer> list = new ArrayList<>();
            if(listNode == null){
                return list;
            }

            ListNode pre = null;
            ListNode cur = listNode;
            ListNode temp = cur.next;

            while(cur != null){
                temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }


            while(pre != null){
                list.add(pre.val);
                pre = pre.next;
            }

            return list;
        }
    }

}
