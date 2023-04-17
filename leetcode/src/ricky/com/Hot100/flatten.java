package ricky.com.Hot100;

import java.util.ArrayList;

/**
 * @Author xdg
 * @Date 2023/4/3 13:25
 */
public class flatten {
    /*114. 二叉树展开为链表
    给你二叉树的根结点 root ，请你将它展开为一个单链表：
    展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
    展开后的单链表应该与二叉树 先序遍历 顺序相同。*/
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
        ArrayList<TreeNode> list = new ArrayList<>();

        public void flatten(TreeNode root) {
            if (root == null) {
                return;
            }

            preOrder(root);
            TreeNode head = list.get(0);
            //因为list里面的TreeNode有些是左右子树都有的，所以必须给他们left置空
            head.left = null;
            TreeNode cur = head;
            for (int i = 1; i < list.size(); i++) {
                //left也要置空
                cur.left = null;
                cur.right = list.get(i);
                cur = cur.right;
            }

            return;
        }

        private void preOrder(TreeNode root) {
            if (root == null) {
                return;
            }

            list.add(root);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
