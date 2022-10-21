package com.ricky.offer;
/*描述
        给一个长度为n链表，若其中包含环，请找出该链表的环的入口结点，否则，返回null。
        数据范围： n\le10000n≤10000，1<=结点值<=100001<=结点值<=10000
        要求：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)*/
public class JZ23 {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }

        ListNode l = pHead;
        ListNode r = pHead;

        boolean flag = false;
        while (r != null && r.next != null) {
            l = l.next;
            r = r.next.next;
            if (r == l) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            return null;
        } else {
            int n = 1;
            r = r.next;
            while(r != l){
                n++;
                r = r.next;
            }

            l = pHead;
            r = pHead;
            for(int i = 0; i < n; i++){
                r = r.next;
            }

            while(r != l){
                r = r.next;
                l = l.next;
            }
            return l;
        }

}
