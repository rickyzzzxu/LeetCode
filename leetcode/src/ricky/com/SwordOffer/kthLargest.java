package ricky.com.SwordOffer;

import java.util.ArrayList;

/**
 * @Author xdg
 * @Date 2023/3/3 18:34
 */
public class kthLargest {
    /*剑指 Offer 54. 二叉搜索树的第k大节点
    给定一棵二叉搜索树，请找出其中第 k 大的节点的值。*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        ArrayList<Integer> res = new ArrayList<>();

        public int kthLargest(TreeNode root, int k) {

            inOrder(root);
            return res.get(k - 1);
        }

        private void inOrder(TreeNode root) {
            if (root == null) {
                return;
            }

            inOrder(root.right);
            res.add(root.val);
            inOrder(root.left);
        }
    }
}
