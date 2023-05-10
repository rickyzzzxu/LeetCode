package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/5 12:33
 */
public class detectCycle {
    /*142. 环形链表 II
    给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
    如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定
    链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
    如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
    不允许修改 链表。*/

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null) {
                return null;
            }

            ListNode fast = head;
            ListNode slow = head;
            boolean flag = false;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                return null;
            } else {
                //从头结点到环的起始节点为a，环的大小为b，第一次相遇f=2s，s=nb,
                //那么所有走到链表入口节点时的步数是：k=a+nb，此时slow已走nb，fast从头开始，
                //走到入口，走了a，此时slow也走了a+nb，所以相遇点就是入口节点
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }

                return fast;
            }
        }
    }
}
