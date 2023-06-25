package ricky.com.SwordOffer;

public class mirrorTree {
    /*请完成一个函数，输入一个二叉树，该函数输出它的镜像。*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode mirrorTree(TreeNode root) {
            if (root == null) {
                return null;
            }

            TreeNode l = mirrorTree(root.left);
            TreeNode r = mirrorTree(root.right);
            root.left = r;
            root.right = l;
            return root;
        }
    }
}
