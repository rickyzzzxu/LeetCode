package com.ricky.tree;

import java.util.HashMap;

public class JZ7 {
    /**重建二叉树
     * 描述
     * 给定节点数为 n 的二叉树的前序遍历和中序遍历结果，请重建出该二叉树并返回它的头结点。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
     * Definition for binary tree
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class Solution {
        HashMap<Integer,Integer> map = new HashMap<>();
        public TreeNode reConstructBinaryTree(int [] pre,int [] vin) {
            if(pre == null){
                return null;
            }

            for(int i = 0; i < vin.length; i++){
                map.put(vin[i], i);
            }

            return f(pre, 0, pre.length - 1, vin, 0, vin.length - 1);
        }

        public TreeNode f(int[] pre, int l1, int r1, int[] vin, int l2, int r2){
            if(l1 > r1){
                return null;
            }

            TreeNode root = new TreeNode(pre[l1]);
            int i = map.get(pre[l1]);

            root.left = f(pre, l1 + 1, l1 + i - l2, vin, l2, i - 1);
            root.right = f(pre, l1 + i - l2 + 1, r1, vin, i + 1, r2);
            return root;
        }
    }
}
