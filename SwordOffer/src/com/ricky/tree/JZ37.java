package com.ricky.tree;

import java.util.LinkedList;

public class JZ37 {
    /*序列化二叉树
    描述
    请实现两个函数，分别用来序列化和反序列化二叉树，不对序列化之后的字符串进行约束，
    但要求能够根据序列化之后的字符串重新构造出一棵与原二叉树相同的树。
    二叉树的序列化(Serialize)是指：把一棵二叉树按照某种遍历方式的结果以某种格式保
    存为字符串，从而使得内存中建立起来的二叉树可以持久保存。序列化可以基于先序、中序、后序、层序的二叉树等遍历方式来进行修改，序列化的结果是一个字符串，序列化时通过 某种符号表示空节点（#）
    二叉树的反序列化(Deserialize)是指：根据某种遍历顺序得到的序列化字符串结果str，
    重构二叉树。*/
    /*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
import java.util.*;
    public class Solution {
        String Serialize(TreeNode root) {
            if (root == null) {
                return "";
            }

            Queue<TreeNode> queue = new LinkedList<>();
            StringBuilder str = new StringBuilder();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node != null) {
                    queue.add(node.left);
                    queue.add(node.right);
                    str.append(node.val + ",");
                } else {
                    str.append("#,");
                }
            }
            return str.toString();
        }

        TreeNode Deserialize(String str) {
            if (str == null || str.length() == 0) {
                return null;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            String[] s = str.split(",");
            int i = 1;
            TreeNode root = new TreeNode(Integer.parseInt(s[0]));
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (!s[i].equals("#")) {
                    TreeNode left = new TreeNode(Integer.parseInt(s[i]));
                    node.left = left;
                    queue.add(left);
                }
                i++;
                if(!s[i].equals("#")){
                    TreeNode right = new TreeNode(Integer.parseInt(s[i]));
                    node.right = right;
                    queue.add(right);
                }
                i++;
            }
            return root;
        }
    }
}
