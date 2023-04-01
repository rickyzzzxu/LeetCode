package ricky.com.SwordOffer;

import java.util.LinkedList;
import java.util.Queue;

public class Codec {
    /*剑指 Offer 37. 序列化二叉树
    请实现两个函数，分别用来序列化和反序列化二叉树。
    你需要设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证
    一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Codec1 {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) {
                return "";
            }

            StringBuilder str = new StringBuilder();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node != null) {
                    queue.add(node.left);
                    queue.add(node.right);
                    str.append(node.val + ",");
                } else {
                    str.append("null,");
                }
            }

            return str.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == "") {
                return null;
            }

            String[] str = data.split(",");
            TreeNode root = new TreeNode(Integer.parseInt(str[0]));
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int k = 1;
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (!str[k].equals("null")) {
                    node.left = new TreeNode(Integer.parseInt(str[k]));
                    queue.add(root.left);
                }
                k++;

                if (!str[k].equals("null")) {
                    node.right = new TreeNode(Integer.parseInt(str[k]));
                    queue.add(root.right);
                }
                k++;
            }

            return root;
        }
    }

}
