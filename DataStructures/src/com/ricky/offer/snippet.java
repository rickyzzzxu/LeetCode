/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
import java.util.HashMap;
public class Solution {
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
