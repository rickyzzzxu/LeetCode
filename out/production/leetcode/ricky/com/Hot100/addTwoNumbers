package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/12 20:58
 */
public class addTwoNumbers {
    /*2. 两数相加
    给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位
    数字。请你将两个数相加，并以相同形式返回一个表示和的链表。你可以假设除了数字 0 之外，这两个数都不会以 0 开头。*/
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode pre = new ListNode(-1);
            ListNode cur = pre;
            int carry = 0;
            int val1 = 0;
            int val2 = 0;
            while (l1 != null || l2 != null) {
                if (l1 == null) {
                    val1 = 0;
                } else {
                    val1 = l1.val;
                }

                if (l2 == null) {
                    val2 = 0;
                } else {
                    val2 = l2.val;
                }

                int sum = val1 + val2 + carry;
                carry = sum / 10;
                ListNode temp = new ListNode(sum % 10);
                cur.next = temp;
                cur = cur.next;

                if (l1 != null) {
                    l1 = l1.next;
                }

                if (l2 != null) {
                    l2 = l2.next;
                }
            }

            if (carry > 0) {
                cur.next = new ListNode(carry);
            }

            return pre.next;

        }
    }


}
