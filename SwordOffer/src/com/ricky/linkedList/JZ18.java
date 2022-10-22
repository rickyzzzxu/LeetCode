package com.ricky.linkedList;
/*描述
        给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。返回删除后的链表的头节点。

        1.此题对比原题有改动
        2.题目保证链表中节点的值互不相同
        3.该题只会输出返回的链表和结果做对比，所以若使用 C 或 C++ 语言，你不需要 free 或 delete 被删除的节点

        数据范围:
        0<=链表节点值<=10000
        0<=链表长度<=10000*/
public class JZ18 {
    public ListNode deleteNode (ListNode head, int val) {
        // write code here
        if(head == null){
            return null;
        }

        if(head.val == val){
            return head.next;
        }

        ListNode cur = head;
        ListNode temp = cur.next;
        while(temp != null){
            if(temp.val == val){
                cur.next = temp.next;
                break;
            }
            cur = temp;
            temp = temp.next;
        }
        return head;
    }
}
