package com.ricky.tree;

public class JZ86 {
    /*在二叉树中找到两个节点的最近公共祖先
    描述
    给定一棵二叉树(保证非空)以及这棵树上的两个节点对应的val值 o1 和 o2，请找到 o1 和 o2 的最近公共祖先节点。
    数据范围：树上节点数满足 1 \le n \le 10^5 \1≤n≤10
            , 节点值val满足区间 [0,n)
    要求：时间复杂度 O(n)O(n)
    注：本题保证二叉树中每个节点的val值均不相同。*/
    /*
     * public class TreeNode {
     *   int val = 0;
     *   TreeNode left = null;
     *   TreeNode right = null;
     * }
     */

    public class Solution {
        /**
         *
         * @param root TreeNode类
         * @param o1 int整型
         * @param o2 int整型
         * @return int整型
         */
        public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
            // write code here
            return f(root, o1, o2).val;
        }

        public TreeNode f(TreeNode root, int o1, int o2){
            if(root == null){
                return null;
            }

            if(root.val == o1 || root.val == o2){
                return root;
            }

            TreeNode left = f(root.left, o1, o2);
            TreeNode right = f(root.right, o1, o2);
            if(left == null){
                return right;
            }

            if(right == null){
                return left;
            }

            return root;
        }
    }
}
