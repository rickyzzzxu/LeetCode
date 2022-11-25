package com.ricky;

public class printNumbers {
    /*输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印
    出 1、2、3 一直到最大的 3 位数 999。*/
    class Solution {
        public int[] printNumbers(int n) {
            int end = (int)(Math.pow(10, n) - 1);
            int[] res = new int[end];
            for(int i = 1; i <= end; i++){
                res[i - 1] = i;
            }
            return res;
        }
    }
}
