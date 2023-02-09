package ricky.com.SwordOffer;

public class deleteNode {
    /*给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
    返回删除后的链表的头节点。*/
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            ListNode cur = head;
            ListNode temp = head.next;
            ;
            if (head.val == val) {
                return head.next;
            }

            while (temp != null) {
                if (temp.val == val) {
                    cur.next = temp.next;
                    return head;
                }

                cur = temp;
                temp = cur.next;
            }
            return null;
        }
    }
}
