package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/18 16:34
 */
public class removeNthFromEnd {
    /*19. 删除链表的倒数第 N 个结点
    给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。*/

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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int len = getLen(head);
            int k = len - n;
            if (n == len) {
                return head.next;
            }

            ListNode cur = head;
            for (int i = 0; i < k - 1; i++) {
                cur = cur.next;
            }

            cur.next = cur.next.next;
            return head;
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
