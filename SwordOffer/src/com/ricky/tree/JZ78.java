package com.ricky.tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class JZ78 {
    /*把二叉树打印成多行
    描述
    给定一个节点数为 n 二叉树，要求从上到下按层打印二叉树的 val 值，同一层结点从左至右输出，
    每一层输出一行，将输出的结果存放到一个二维数组中返回。*/

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
        ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            if (pRoot == null) {
                return res;
            }

            queue.add(pRoot);
            while (!queue.isEmpty()) {
                int size = queue.size();
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }

                    list.add(node.val);
                }
                res.add(list);
            }
            return res;
        }

    }

}
