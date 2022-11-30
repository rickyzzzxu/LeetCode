package com.ricky.other_algorithms;

public class JZ43 {
    /*整数中1出现的次数（从1到n整数中1出现的次数）
    描述
    输入一个整数 n ，求 1～n 这 n 个整数的十进制表示中 1 出现的次数
    例如， 1~13 中包含 1 的数字有 1 、 10 、 11 、 12 、 13 因此共出现 6 次
    注意：11 这种情况算两次
    数据范围： 1 \le n \le 30000 \1≤n≤30000
    进阶：空间复杂度 O(1) \O(1)  ，时间复杂度 O(lognn) \O(lognn)*/
    public class Solution {
        public int NumberOf1Between1AndN_Solution(int n) {
            long res = 0;
            int bit = 1;

            //123156:high=123,cur=1,low=56;
            int high = n / bit / 10;
            int low = n % bit;
            int cur = n / bit % 10;
            while (bit <= n) {
                if (cur < 1) {
                    res = res + high * bit;
                } else if (cur == 1) {
                    res = res + high * bit + low + 1;
                } else {
                    res = res + (high + 1) * bit;
                }

                bit *= 10;
                high = n / bit / 10;
                low = n % bit;
                cur = n / bit % 10;
            }

            return (int)res;
        }
    }

}
