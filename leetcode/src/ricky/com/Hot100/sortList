package ricky.com.Hot100;

import java.util.PriorityQueue;

/**
 * @Author xdg
 * @Date 2023/4/6 19:24
 */
public class sortList {
    /*148. 排序链表
    给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。*/
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null) {
                return null;
            }

            PriorityQueue<ListNode> queue = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
            while (head != null) {
                queue.add(head);
                head = head.next;
            }

            ListNode pre = new ListNode(-1);
            ListNode cur = pre;
            while (!queue.isEmpty()) {
                cur.next = queue.poll();
                cur = cur.next;
            }

            cur.next = null;

            return pre.next;
        }
    }
}
