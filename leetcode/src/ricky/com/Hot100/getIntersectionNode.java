package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/6 20:04
 */
public class getIntersectionNode {
    /*160. 相交链表
    给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
    如果两个链表不存在相交节点，返回 null 。
    图示两个链表在节点 c1 开始相交：
    题目数据 保证 整个链式结构中不存在环。
    注意，函数返回结果后，链表必须 保持其原始结构 。*/

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int lenA = getLen(headA);
            int lenB = getLen(headB);
            if (lenA > lenB) {
                int k = lenA - lenB;
                for (int i = 0; i < k; i++) {
                    headA = headA.next;
                }

                while (headA != headB) {
                    headA = headA.next;
                    headB = headB.next;
                }

                return headA;
            } else {
                int k = lenB - lenA;
                for (int i = 0; i < k; i++) {
                    headB = headB.next;
                }

                while (headA != headB) {
                    headA = headA.next;
                    headB = headB.next;
                }

                return headA;
            }
        }

        private int getLen(ListNode head) {
            int res = 0;
            while (head != null) {
                res++;
                head = head.next;
            }

            return res;
        }
    }
}
