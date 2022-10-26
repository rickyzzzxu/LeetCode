package com.ricky.tree;

import java.util.LinkedList;

public class JZ36 {
    /**    二叉搜索树与双向链表
     * 描述
     * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表
     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }
     */
    public class Solution {
        Queue<TreeNode> queue = new LinkedList<>();
        public TreeNode Convert(TreeNode pRootOfTree) {
            if (pRootOfTree == null) {
                return null;
            }

            inOrder(pRootOfTree);
            TreeNode head = queue.poll();
            TreeNode pre = head;
            while(!queue.isEmpty()){
                TreeNode next = queue.poll();
                pre.right = next;
                next.left = pre;
                pre = next;
            }

            return head;
        }

        public void inOrder(TreeNode root) {
            if (root == null) {
                return;
            }

            inOrder(root.left);
            queue.add(root);
            inOrder(root.right);
        }
    }

}
