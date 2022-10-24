package com.ricky.tree;

import javax.swing.tree.TreeNode;

public class JZ84 {

    /*二叉树中和为某一值的路径(三)
    描述
给定一个二叉树root和一个整数值 sum ，求该树有多少路径的的节点值之和等于 sum 。
1.该题路径定义不需要从根节点开始，也不需要在叶子节点结束，但是一定是从父亲节点往下到孩子节点
2.总节点数目为n
3.保证最后返回的路径个数在整形范围内(即路径个数小于231-1)

数据范围:
0<=n<=10000<=n<=1000
-10^9<=节点值<=10^9−10
9
 <=节点值<=10
9

     * public class TreeNode {
     *   int val = 0;
     *   TreeNode left = null;
     *   TreeNode right = null;
     *   public TreeNode(int val) {
     *     this.val = val;
     *   }
     * }
     */

    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param root TreeNode类
         * @param sum int整型
         * @return int整型
         */
        int count = 0;
        public int FindPath (TreeNode root, int sum) {
            // write code here
            if(root == null){
                return 0;
            }

            dfs(root, sum);
            FindPath(root.left, sum);
            FindPath(root.right, sum);
            return count;
        }

        public void dfs(TreeNode root, int target){
            if(root == null){
                return;
            }

            target -= root.val;
            if(target == 0){
                count++;
            }

            dfs(root.left, target);
            dfs(root.right, target);
        }
    }
}
