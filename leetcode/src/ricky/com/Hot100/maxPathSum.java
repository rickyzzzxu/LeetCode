package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/4 13:38
 */
public class maxPathSum {
    /*124. 二叉树中的最大路径和
    路径 被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。同一个节点在一条路径
    序列中 至多出现一次 。该路径 至少包含一个 节点，且不一定经过根节点。
    路径和 是路径中各节点值的总和。
    给你一个二叉树的根节点 root ，返回其 最大路径和 。
    */
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
        int res = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            afterOrder(root);
            return res;
        }

        private int afterOrder(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int left = afterOrder(root.left);
            int right = afterOrder(root.right);
            //总共三个选择，1：root本身2：root+Math.max(left, right)3：root+left+right,取最大值
            int temp = Math.max(root.val, root.val + Math.max(left, right));
            res = Math.max(res, Math.max(temp, root.val + left + right));
            return temp;
        }
    }
}
