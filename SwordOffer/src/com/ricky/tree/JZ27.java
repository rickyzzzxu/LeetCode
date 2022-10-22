package com.ricky.tree;

import javax.swing.tree.TreeNode;

public class JZ27 {

    /*二叉树的镜像import
    描述
操作给定的二叉树，将其变换为源二叉树的镜像。
数据范围：二叉树的节点数 0 \le n \le 10000≤n≤1000 ， 二叉树每个节点的值 0\le val \le 10000≤val≤1000
要求： 空间复杂度 O(n)O(n) 。本题也有原地操作，即空间复杂度 O(1)O(1) 的解法，时间复杂度 O(n)O(n)
     * public class TreeNode {
     *   int val = 0;
     *   TreeNode left = null;
     *   TreeNode right = null;
     *   public TreeNode(int val) {
     *     this.val = val;
     *   }
     * }
     */

    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param pRoot TreeNode类
         * @return TreeNode类
         */
        public TreeNode Mirror (TreeNode pRoot) {
            // write code here
            if(pRoot == null){
                return null;
            }

            if(pRoot.left != null){
                Mirror(pRoot.left);
            }
            if(pRoot.right != null){
                Mirror(pRoot.right);
            }

            TreeNode temp = pRoot.left;
            pRoot.left = pRoot.right;
            pRoot.right = temp;
            return pRoot;
        }
    }
}
