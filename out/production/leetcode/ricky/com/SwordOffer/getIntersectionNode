package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/1 20:48
 */

public class getIntersectionNode {
    /*剑指 Offer 52. 两个链表的第一个公共节点
    输入两个链表，找出它们的第一个公共节点。*/
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    class Solution {
        ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int len1 = getLength(headA);
            int len2 = getLength(headB);
            ListNode curA = headA;
            ListNode curB = headB;
            if (len1 - len2 > 0) {
                int k = len1 - len2;
                for (int i = 0; i < k; i++) {
                    curA = curA.next;
                }

                while (curA != curB) {
                    curA = curA.next;
                    curB = curB.next;
                }
            } else {
                int k = len2 - len1;
                for (int i = 0; i < k; i++) {
                    curB = curB.next;
                }

                while (curA != curB) {
                    curA = curA.next;
                    curB = curB.next;
                }
            }

            return curA;
        }

        private int getLength(ListNode head) {
            if (head == null) {
                return 0;
            }

            int res = 0;
            while (head != null) {
                res++;
                head = head.next;
            }

            return res;
        }
    }
}
