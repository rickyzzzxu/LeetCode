package com.ricky.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JZ77 {

/* 按之字形顺序打印二叉树
描述
给定一个二叉树，返回该二叉树的之字形层序遍历，（第一层从左向右，下一层从右向左，一直这样交替）

数据范围：0 \le n \le 15000≤n≤1500,树上每个节点的val满足 |val| <= 1500∣val∣<=1500
要求：空间复杂度：O(n)O(n)，时间复杂度：O(n)O(n)
 */
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
        public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            if(pRoot == null){
                return res;
            }

            queue.add(pRoot);
            boolean flag = false;
            while(!queue.isEmpty()){
                ArrayList<Integer> list = new ArrayList<>();
                int size = queue.size();
                for(int i = 0; i < size; i++){
                    TreeNode node = queue.poll();
                    if(node.left != null){
                        queue.add(node.left);
                    }
                    if(node.right != null){
                        queue.add(node.right);
                    }
                    if(!flag){
                        list.add(node.val);
                    }else{
                        list.add(0, node.val);
                    }
                }
                res.add(list);
                flag = !flag;
            }
            return res;
        }

    }

}
