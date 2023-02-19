package ricky.com.SwordOffer;

public class mergeTwoLists {
    /*输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。*/
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(-1);
            ListNode cur = dummy;
            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    cur.next = l1;
                    l1 = l1.next;
                } else {
                    cur.next = l2;
                    l2 = l2.next;
                }

                cur = cur.next;
            }

            if (l1 != null) {
                cur.next = l1;
            }

            if (l2 != null) {
                cur.next = l2;
            }

            return dummy.next;
        }
    }
}
