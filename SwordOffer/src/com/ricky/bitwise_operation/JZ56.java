package com.ricky.bitwise_operation;

public class JZ56 {
    /*数组中只出现一次的两个数字
            描述
    一个整型数组里除了两个数字只出现一次，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
    数据范围：数组长度 2\le n \le 10002≤n≤1000，数组中每个数的大小 0 < val \le 10000000<val≤1000000
    要求：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)
    提示：输出时按非降序排列。*/


    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param array int整型一维数组
         * @return int整型一维数组
         */
        public int[] FindNumsAppearOnce (int[] array) {
            // write code here
            int[] res = new int[2];
            int temp = 0;
            //array中相同的数会被消除，temp只剩两个不同的数字
            for (int i = 0; i < array.length; i++) {
                temp ^= array[i];
            }

            int k = 1;
            //找到temp最右边第一个1和后续：1000
            while ((temp & k) == 0) {
                k = k << 1;
            }

            //分类
            for (int i = 0; i < array.length; i++) {
                if ((array[i] & k) == 0) {
                    res[0] ^= array[i];
                } else {
                    res[1] ^= array[i];
                }
            }

            if (res[0] > res[1]) {
                int t = res[0];
                res[0] = res[1];
                res[1] = t;
            }
            return res;
        }
    }
}
