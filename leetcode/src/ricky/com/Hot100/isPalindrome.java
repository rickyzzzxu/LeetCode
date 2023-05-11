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
            if (head == null) {
                return true;
            }

            ListNode fast = head;
            ListNode slow = head;
            //后一半链表的起始位置的前一个节点，因为要让这个节点的next指向null
            ListNode pre = new ListNode(-1);
            pre.next = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                pre = pre.next;
            }

            pre.next = null;
            //必须传slow，考虑到奇偶数的问题
            ListNode right = reverse(slow);
            while (head != null && right != null) {
                if (head.val != right.val) {
                    return false;
                }
                head = head.next;
                right = right.next;
            }

            return true;
        }

        private ListNode reverse(ListNode slow) {
            if (slow == null) {
                return null;
            }

            ListNode pre = null;
            ListNode cur = slow;
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
