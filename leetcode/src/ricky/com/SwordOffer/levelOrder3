package ricky.com.SwordOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder3 {
    /*剑指 Offer 32 - III. 从上到下打印二叉树 III
    请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，
    第三行再按照从左到右的顺序打印，其他行以此类推。*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if (root == null) {
                return res;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            boolean flag = true;
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }

                    if (flag) {
                        list.add(node.val);
                    } else {
                        list.add(0, node.val);
                    }

                }

                flag = !flag;
                res.add(list);
            }

            return res;
        }
    }
}
