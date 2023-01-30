package ricky.com.SwordOffer;

import java.util.HashMap;

public class buildTree {
    /*输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
    假设输入的前序遍历和中序遍历的结果中都不含重复的数字。*/

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        HashMap<Integer, Integer> map = new HashMap<>();

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder.length == 0) {
                return null;
            }

            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }

            return f(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        }

        public TreeNode f(int[] pre, int l1, int r1, int[] inorder, int l2, int r2) {
            if (l1 > r1) {
                return null;
            }

            TreeNode root = new TreeNode(pre[l1]);
            int i = map.get(pre[l1]);
            root.left = f(pre, l1 + 1, l1 + i - l2, inorder, l2, i - l2);
            root.right = f(pre, l1 + i - l2 + 1, r1, inorder, i + 1, r2);
            return root;
        }
    }
}
