package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/3 19:14
 */
public class isBalanced {
    /*剑指 Offer 55 - II. 平衡二叉树
    输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不
    超过1，那么它就是一棵平衡二叉树。*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null) {
                return true;
            }

            int left = check(root.left);
            int right = check(root.right);
            if (Math.abs(left - right) > 1) {
                return false;
            }

            return isBalanced(root.left) && isBalanced(root.right);
        }

        private int check(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int left = check(root.left);
            int right = check(root.right);
            return Math.max(left, right) + 1;

        }
    }
}
