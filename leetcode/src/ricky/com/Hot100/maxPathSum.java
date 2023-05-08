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
            if (root == null) {
                return -1;
            }

            postOrder(root);
            return res;
        }

        private int postOrder(TreeNode root) {
            if (root == null) {
                return 0;
            }

            // 计算左子树的最大路径和和右子树的最大路径和
            int l = postOrder(root.left);
            int r = postOrder(root.right);
            // 计算以当前节点为根节点的最大路径和，并更新全局最大路径和
            int tempMax = Math.max(root.val, root.val + Math.max(l, r));
            res = Math.max(res, Math.max(tempMax, root.val + l + r));
            // 返回以当前节点为起点的路径
            return tempMax;
        }
    }
}
