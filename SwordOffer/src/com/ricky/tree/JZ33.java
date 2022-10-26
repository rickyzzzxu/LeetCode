package com.ricky.tree;

public class JZ33 {
    /*二叉搜索树的后序遍历序列
            描述
    输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则返回 true ,否则返回 false 。假设输入的数组的任意两个数字都互不相同。

    数据范围： 节点数量 0 \le n \le 10000≤n≤1000 ，节点上的值满足 1 \le val \le 10^{5}1≤val≤10
            5
            ，保证节点上的值各不相同
    要求：空间复杂度 O(n)O(n) ，时间时间复杂度 O(n^2)O(n
2
        )
    提示：
            1.二叉搜索树是指父亲节点大于左子树中的全部节点，但是小于右子树中的全部节点的树。
            2.该题我们约定空树不是二叉搜索树
3.后序遍历是指按照 “左子树-右子树-根节点” 的顺序遍历*/
    public class Solution {
        public boolean VerifySquenceOfBST(int [] sequence) {
            //if (sequence == null) {
            //    return false;
            //}

            if (sequence.length == 0) {
                return false;
            }

            return f(sequence, 0, sequence.length - 1);
        }

        public boolean f(int[] sequence, int l, int r) {
            if (l >= r) {
                return true;
            }

            int root = sequence[r];
            int first = l;
            while (root > sequence[first]) {
                first++;
            }

            for (int i = first; i < r; i ++) {
                if (root > sequence[i]) {
                    return false;
                }
            }

            return f(sequence, l, first - 1) && f(sequence, first, r - 1);
        }
    }
}
