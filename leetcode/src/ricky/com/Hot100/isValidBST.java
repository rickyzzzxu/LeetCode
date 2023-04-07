package ricky.com.Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xdg
 * @Date 2023/4/1 18:35
 */
public class isValidBST {
    /*98. 验证二叉搜索树
    给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
    有效 二叉搜索树定义如下：
    节点的左子树只包含 小于 当前节点的数。
    节点的右子树只包含 大于 当前节点的数。
    所有左子树和右子树自身必须也是二叉搜索树。*/
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
        List<Integer> list = new ArrayList<>();

        public boolean isValidBST(TreeNode root) {
            inOrder(root);
            for (int i = list.size() - 1; i > 0; i--) {
                if (list.get(i) <= list.get(i - 1)) {
                    return false;
                }
            }

            return true;
        }

        private void inOrder(TreeNode root) {
            if (root == null) {
                return;
            }

            inOrder(root.left);
            list.add(root.val);
            inOrder(root.right);
        }
    }
}
