package ricky.com.Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xdg
 * @Date 2023/4/1 15:21
 */
public class inorderTraversal {
    /*94. 二叉树的中序遍历
    给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。*/
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
        List<Integer> res = new ArrayList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            if (root == null) {
                return res;
            }

            inOrder(root);
            return res;
        }

        private void inOrder(TreeNode root) {
            if (root == null) {
                return;
            }

            inOrder(root.left);
            res.add(root.val);
            inOrder(root.right);
        }
    }
}
