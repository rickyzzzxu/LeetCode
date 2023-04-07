package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/7 11:32
 */
public class isPalindrome {
    /*234. 回文链表
    给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。*/
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
        public boolean isPalindrome(ListNode head) {
            ListNode pre = new ListNode(-1);
            pre.next = head;
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                pre = pre.next;
            }

            pre.next = null;
            slow = reverse(slow);
            while (head != null && slow != null) {
                if (head.val != slow.val) {
                    return false;
                }
                head = head.next;
                slow = slow.next;
            }

            return true;
        }

        private ListNode reverse(ListNode head) {
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
