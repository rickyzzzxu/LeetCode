package ricky.com.Hot100;

import java.util.HashMap;

/**
 * @Author xdg
 * @Date 2023/4/1 19:19
 */
public class buildTree {
    /*105. 从前序与中序遍历序列构造二叉树
    给定两个整数数组 preorder 和 inorder ，其中 preorder 是二叉树的先序遍历， inorder 是同一棵树的中序遍历，
    请构造二叉树并返回其根节点。*/
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
        HashMap<Integer, Integer> map = new HashMap<>();

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }

            return f(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        }

        private TreeNode f(int[] preorder, int l1, int r1, int[] inorder, int l2, int r2) {
            if (l1 > r1) {
                return null;
            }

            TreeNode root = new TreeNode(preorder[l1]);
            int i = map.get(preorder[l1]);
            root.left = f(preorder, l1 + 1, l1 + i - l2, inorder, l2, i - 1);
            root.right = f(preorder, l1 + i - l2 + 1, r1, inorder, i + 1, r2);
            return root;
        }
    }


}
