package ricky.com;

import java.util.LinkedList;
import java.util.Queue;

public class treeToDoublyList {
    /*输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指
    针的指向。*/

// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

    class Solution {
        Queue<Node> queue = new LinkedList<>();
        public Node treeToDoublyList(Node root) {
            if(root == null){
                return null;
            }

            inOrder(root);
            Node head = queue.poll();
            Node cur = head;
            while(!queue.isEmpty()){
                Node temp = queue.poll();
                cur.right = temp;
                temp.left = cur;
                cur = temp;
            }

            cur.right = head;
            head.left = cur;
            return head;
        }

        public void inOrder(Node root){
            if(root == null){
                return;
            }

            inOrder(root.left);
            queue.add(root);
            inOrder(root.right);
        }
    }
}
