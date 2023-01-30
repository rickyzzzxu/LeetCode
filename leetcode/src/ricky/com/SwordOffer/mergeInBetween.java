package ricky.com.SwordOffer;

public class mergeInBetween {
    /*给你两个链表 list1 和 list2 ，它们包含的元素分别为 n 个和 m 个。
    请你将 list1 中下标从 a 到 b 的全部节点都删除，并将list2 接在被删除节点的位置。*/
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
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            ListNode cur = list1;
            ListNode temp = list1;
            for (int i = 0; i <= b; i++) {
                temp = temp.next;
            }


            for (int i = 0; i < a - 1; i++) {
                cur = cur.next;
            }

            cur.next = list2;
            while (cur.next != null) {
                cur = cur.next;
            }

            cur.next = temp;
            return list1;
        }
    }
}
