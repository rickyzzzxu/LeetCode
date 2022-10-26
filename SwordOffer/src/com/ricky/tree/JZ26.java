package com.ricky.tree;

public class JZ26 {
    /**    树的子结构
     * 描述
     * 输入两棵二叉树A，B，判断B是不是A的子结构
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
        public boolean HasSubtree(TreeNode root1,TreeNode root2) {
            if(root1 == null || root2 == null){
                return false;
            }

            if(isSub(root1, root2)){
                return true;
            }else{
                return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
            }
        }

        public boolean isSub(TreeNode root1, TreeNode root2){
            if(root2 == null){
                return true;
            }

            if(root1 == null){
                return false;
            }

            if(root1.val != root2.val){
                return false;
            }else{
                return isSub(root1.left, root2.left) && isSub(root1.right, root2.right);
            }
        }
    }

}
