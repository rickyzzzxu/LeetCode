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
           if(head == null){
               return null;
           }

           HashMap<Node, Node> map = new HashMap<>();
           Node cur = head;
           while(cur != null){
               Node temp = new Node(cur.val);
               map.put(cur, temp);
               cur = cur.next;
           }

           Node cur1 = head;
           while(cur1 != null){
               map.get(cur1).next = map.get(cur1.next);
               map.get(cur1).random = map.get(cur1.random);
               cur1 = cur1.next;
           }

           return map.get(head);
       }
   }
}
