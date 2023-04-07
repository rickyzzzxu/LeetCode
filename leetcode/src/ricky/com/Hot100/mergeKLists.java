package ricky.com.Hot100;

import java.util.PriorityQueue;

/**
 * @Author xdg
 * @Date 2023/3/20 17:32
 */
public class mergeKLists {
    /*23. 合并K个升序链表
    给你一个链表数组，每个链表都已经按升序排列。
    请你将所有链表合并到一个升序链表中，返回合并后的链表。*/
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
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for (int i = 0; i < lists.length; i++) {
                while (lists[i] != null) {
                    queue.add(lists[i].val);
                    lists[i] = lists[i].next;
                }
            }

            ListNode dummy = new ListNode(-1);
            ListNode cur = dummy;
            while (!queue.isEmpty()) {
                ListNode temp = new ListNode(queue.poll());
                cur.next = temp;
                cur = cur.next;
            }

            return dummy.next;
        }
    }


}
