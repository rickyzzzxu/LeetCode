package ricky.com.SwordOffer;

import java.util.ArrayList;
import java.util.List;

public class pathSum {
    /*剑指 Offer 34. 二叉树中和为某一值的路径
    给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
    叶子节点 是指没有子节点的节点。*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> pathSum(TreeNode root, int target) {
            if (root == null) {
                return res;
            }

            dfs(root, target);
            return res;
        }

        public void dfs(TreeNode root, int target) {
            if (root == null) {
                return;
            }

            target -= root.val;
            list.add(root.val);

            if (target == 0 && root.left == null && root.right == null) {
                res.add(new ArrayList<>(list));
            }

            dfs(root.left, target);
            dfs(root.right, target);

            list.remove(list.size() - 1);
        }
    }
}
