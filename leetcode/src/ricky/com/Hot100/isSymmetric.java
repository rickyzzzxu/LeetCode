package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/1 18:40
 */
public class isSymmetric {
    /*101. 对称二叉树
    给你一个二叉树的根节点 root ， 检查它是否轴对称。*/
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
        public boolean isSymmetric(TreeNode root) {
            return check(root.left, root.right);
        }

        private boolean check(TreeNode l, TreeNode r) {
            if (l == null && r == null) {
                return true;
            }

            if (l == null || r == null) {
                return false;
            }

            if (l.val != r.val) {
                return false;
            } else {
                return check(l.left, r.right) && check(l.right, r.left);
            }
        }
    }
}
