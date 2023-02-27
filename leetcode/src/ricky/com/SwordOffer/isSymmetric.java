package ricky.com.SwordOffer;

public class isSymmetric {
    /*请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }

            return check(root.left, root.right);
        }

        public boolean check(TreeNode l, TreeNode r) {
            if (l == null && r == null) {
                return true;
            }

            if (l == null || r == null) {
                return false;
            }

            if (l.val != r.val) {
                return false;
            } else {
                return check(l.right, r.left) && check(l.left, r.right);
            }
        }
    }
}
