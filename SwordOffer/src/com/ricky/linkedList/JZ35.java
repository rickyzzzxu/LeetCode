package com.ricky.linkedList;

/*描述
        输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊
        指针random指向一个随机节点），请对此链表进行深拷贝，并返回拷贝后的头结点。
        示例:
        输入:{1,2,3,4,5,3,5,#,2,#}
        输出:{1,2,3,4,5,3,5,#,2,#}
        解析:我们将链表分为两段，前半部分{1,2,3,4,5}为ListNode，后半部分{3,5,#,2,#}是随机指针域表示。
        以上示例前半部分可以表示链表为的ListNode:1->2->3->4->5
        后半部分，3，5，#，2，#分别的表示为
        1的位置指向3，2的位置指向5，3的位置指向null，4的位置指向2，5的位置指向null*/
import java.util.HashMap;

public class JZ35 {
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null){
            return null;
        }

        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode cur = pHead;
        while(cur != null){
            RandomListNode node = new RandomListNode(cur.label);
            map.put(cur,node);
            cur = cur.next;
        }

        cur = pHead;
        while(cur != null){
            RandomListNode newHead = map.get(cur);
            newHead.next = map.get(cur.next);
            newHead.random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(pHead);
    }
}
