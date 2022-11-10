package com.ricky.tree;


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
    public class Solution {
        /**
         *
         * @param root TreeNode类
         * @param o1 int整型
         * @param o2 int整型
         * @return int整型
         */
        public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
            // write code here
            return f(root, o1, o2).val;
        }

        public TreeNode f(TreeNode root, int o1, int o2){
            if(root == null){
                return null;
            }

            if(root.val == o1 || root.val == o2){
                return root;
            }

            TreeNode left = f(root.left, o1, o2);
            TreeNode right = f(root.right, o1, o2);
            if(left == null){
                return right;
            }

            if(right == null){
                return left;
            }
            //left != null && right != null,返回root
            return root;
        }
    }
}
