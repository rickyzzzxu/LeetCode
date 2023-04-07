package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/4 17:52
 */
public class hasCycle {
    /*141. 环形链表
    给你一个链表的头节点 head ，判断链表中是否有环。
    如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
    为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中
    的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链
    表的实际情况。
    如果链表中存在环 ，则返回 true 。 否则，返回 false 。*/
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //快慢指针和集合都可以
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null) {
                return true;
            }

            ListNode slow = head;
            ListNode fast = head.next;
            while (fast != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }

            return false;
        }
    }
}
