package com.ricky.tree;

import javax.swing.tree.TreeNode;

public class JZ28 {

    /*对称的二叉树
    描述
给定一棵二叉树，判断其是否是自身的镜像（即：是否对称）
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
        boolean isSymmetrical(TreeNode pRoot) {
            if (pRoot == null) {
                return true;
            }

            return f(pRoot.left, pRoot.right);
        }

        public boolean f(TreeNode A, TreeNode B) {
            if (A == null && B == null) {
                return true;
            }

            if (A == null || B == null) {
                return false;
            }

            if (A.val != B.val) {
                return false;
            }

            return f(A.left, B.right) && f(A.right, B.left);
        }
    }
}
