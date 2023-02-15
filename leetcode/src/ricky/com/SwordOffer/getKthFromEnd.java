package ricky.com.SwordOffer;

public class getKthFromEnd {
    /*输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
    例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4
    的节点。*/
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            int n = 0;
            if (head == null || k == 0) {
                return null;
            }
            ListNode temp = head;
            while (temp != null) {
                n++;
                temp = temp.next;
            }

            if (k > n) {
                return null;
            }

            for (int i = 0; i < n - k; i++) {
                head = head.next;
            }

            return head;
        }

    }
}
