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
        HashMap<Integer, Integer> map;

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder == null || preorder.length == 0) {  // 如果先序遍历数组为空，返回null
                return null;
            }

            map = new HashMap<>();  // 初始化map
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);  // 将中序遍历数组中每个值的索引存入map中
            }
            return f(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        }

        private TreeNode f(int[] pre, int l1, int r1, int[] inOrder, int l2, int r2) {
            if (l1 > r1) {  // 如果左边界大于右边界，返回null，不能有=
                return null;
            }

            TreeNode root = new TreeNode(pre[l1]);  // 先序遍历数组的第一个值为根节点
            int i = map.get(pre[l1]);  // 从map中获取根节点在中序遍历数组中的索引
            root.left = f(pre, l1 + 1, i - l2 + l1, inOrder, l2, i - 1);  // 构建左子树
            root.right = f(pre, i - l2 + l1 + 1, r1, inOrder, i + 1, r2);  // 构建右子树
            return root;  // 返回根节点
        }
    }

}
