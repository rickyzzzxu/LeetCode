package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/1 18:57
 */
public class maxDepth {
    /*104. 二叉树的最大深度
    给定一个二叉树，找出其最大深度。
    二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
    说明: 叶子节点是指没有子节点的节点。*/
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
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

            return getDepth(root);
        }

        private int getDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int right = getDepth(root.right);
            int left = getDepth(root.left);
            return Math.max(right, left) + 1;
        }
    }
}
