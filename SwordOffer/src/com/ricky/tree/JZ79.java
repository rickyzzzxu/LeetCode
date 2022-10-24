package com.ricky.tree;

import javax.swing.tree.TreeNode;
/*判断是不是平衡二叉树
描述
        输入一棵节点数为 n 二叉树，判断该二叉树是否是平衡二叉树。
        在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
        平衡二叉树（Balanced Binary Tree），具有以下性质：
        它是一棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。*/
public class JZ79 {

    public class Solution {
        public boolean IsBalanced_Solution(TreeNode root) {
            if(root == null){
                return true;
            }

            int left = getLength(root.left);
            int right = getLength(root.right);
            if(Math.abs(left - right) > 1){
                return false;
            }

            return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        }

        public int getLength(TreeNode root){
            if(root == null){
                return 0;
            }

            int left = getLength(root.left);
            int right = getLength(root.right);
            return Math.max(left, right) + 1;
        }
    }
}
