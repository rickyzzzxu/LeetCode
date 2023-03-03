package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/3 18:51
 */
public class maxDepth {
    /*剑指 Offer 55 - I. 二叉树的深度
    输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成
    树的一条路径，最长路径的长度为树的深度。*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int maxDepth(TreeNode root) {

            return getDepth(root);
        }

        private int getDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int left = getDepth(root.left);
            int right = getDepth(root.right);
            return Math.max(left, right) + 1;
        }
    }
}
