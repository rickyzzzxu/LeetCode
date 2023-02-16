package ricky.com.SwordOffer;

public class reverseList {
    /*定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。*/

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null) {
                return null;
            }

            ListNode pre = null;
            ListNode cur = head;
            ListNode temp = cur.next;
            while (cur != null) {
                temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }

            return pre;
        }
    }
}
