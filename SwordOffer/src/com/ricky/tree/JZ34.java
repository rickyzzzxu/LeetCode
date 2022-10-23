package com.ricky.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class JZ34 {

    /**二叉树中和为某一值的路径(二)
     * 描述
     * 输入一颗二叉树的根节点root和一个整数expectNumber，找出二叉树中结点值的和为expectNumber的所有路径。
     * 1.该题路径定义为从树的根结点开始往下一直到叶子结点所经过的结点
     * 2.叶子节点是指没有子节点的节点
     * 3.路径只能从父节点到子节点，不能从子节点到父节点
     * 4.总节点数目为n
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
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int expectNumber) {

            if (root == null) {
                return res;
            }

            dfs(root, expectNumber);
            return res;
        }

        void dfs(TreeNode root, int target) {
            if (root == null) {
                return;
            }

            list.add(root.val);
            target -= root.val;
            if (root.left == null && root.right == null && target == 0) {
                res.add(new ArrayList<>(list));
            }
            dfs(root.left, target);
            dfs(root.right, target);
            list.remove(list.size() - 1);
        }
    }
}
