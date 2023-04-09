package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/9 17:44
 */
public class invertTree {
    /*226. 翻转二叉树
    给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。*/
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
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }

            return afterOrder(root);
        }

        private TreeNode afterOrder(TreeNode root) {
            if (root == null) {
                return null;
            }

            TreeNode left = afterOrder(root.left);
            TreeNode right = afterOrder(root.right);
            TreeNode temp = left;
            root.left = right;
            root.right = temp;
            return root;
        }
    }
}
