package com.ricky.tree;

import java.util.ArrayList;

public class JZ54 {

    /*二叉搜索树的第k个节点
    描述
给定一棵结点数为n 二叉搜索树，请找出其中的第 k 小的TreeNode结点值。
1.返回第k小的节点值即可
2.不能查找的情况，如二叉树为空，则返回-1，或者k大于n等等，也返回-1
3.保证n个节点的值不一样
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
         * @param proot TreeNode类
         * @param k int整型
         * @return int整型
         */
        ArrayList<Integer> list = new ArrayList<>();
        public int KthNode (TreeNode proot, int k) {
            // write code here
            if (proot == null) {
                return -1;
            }

            order(proot);
            if (k > list.size() || k == 0) {
                return -1;
            }
            return list.get(k - 1);
        }

        public void order(TreeNode root) {
            if (root == null) {
                return;
            }

            order(root.left);
            list.add(root.val);
            order(root.right);
        }
    }
}
