package com.ricky.other_algorithms;

public class JZ14 {
    /*剪绳子
            描述
    给你一根长度为 n 的绳子，请把绳子剪成整数长的 m 段（ m 、 n 都是整数， n > 1 并且 m > 1 ， m <= n ），
    每段绳子的长度记为 k[1],...,k[m] 。请问 k[1]*k[2]*...*k[m] 可能的最大乘积是多少？例如，当绳子的长度是
    8 时，我们把它剪成长度分别为 2、3、3 的三段，此时得到的最大乘积是 18 。*/
    public class Solution {
        public int cutRope(int target) {
            int res = 1;
            while (target > 4) {
                res = res * 3;
                target -= 3;
            }

            return res * target;
        }
    }

}
