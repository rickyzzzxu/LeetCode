package com.ricky.linkedList;
/*描述
        在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表 1->2->3->3->4->4->5  处理后为 1->2->5
        数据范围：链表长度满足 0 \le n \le 1000 \0≤n≤1000  ，链表中的值满足 1 \le val \le 1000 \1≤val≤1000
        进阶：空间复杂度 O(n)\O(n)  ，时间复杂度 O(n) \O(n)
        例如输入{1,2,3,3,4,4,5}时，对应的输出为{1,2,5}*/

public class JZ76 {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null){
            return pHead;
        }
        ListNode head = new ListNode(0);
        head.next = pHead;
        ListNode pre = head;
        ListNode cur = pre.next;

        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                while(cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                cur = cur.next;
                pre.next = cur;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }

        return head.next;
    }
}
