package ricky.com.SwordOffer;

import java.util.HashMap;

public class copyRandomList {
   /* 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向
    下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。*/

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

    class Solution {
        public Node copyRandomList(Node head) {
            if (head == null) {
                return null;
            }

            HashMap<Node, Node> map = new HashMap<>();
            Node cur = head;
            while (cur != null) {
                Node temp = new Node(cur.val);
                map.put(cur, temp);
                cur = cur.next;
            }

            Node newCur = head;
            while (newCur != null) {
                Node newTemp = map.get(newCur);
                //必须指向新链表，不能覆盖原链表
                newTemp.next = map.get(newCur.next);
                newTemp.random = map.get(newCur.random);
                newCur = newCur.next;
            }

            return map.get(head);
        }
    }
}
