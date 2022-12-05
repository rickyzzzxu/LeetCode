package com.ricky.other_algorithms;

public class JZ83 {
    /*剪绳子（进阶版）
    描述
    给你一根长度为 n 的绳子，请把绳子剪成整数长的 m 段（ m 、 n 都是整数， n > 1 并且 m > 1 ， m <= n ），
    每段绳子的长度记为 k[1],...,k[m] 。请问 k[1]*k[2]*...*k[m] 可能的最大乘积是多少？例如，当绳子的长度是
    8 时，我们把它剪成长度分别为 2、3、3 的三段，此时得到的最大乘积是 18 。
    由于答案过大，请对 998244353 取模。*/

    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param number long长整型
         * @return long长整型
         */

        int mod = 998244353;
        public long cutRope (long number) {
            // write code here
            if (number <= 3) {
                return number - 1;
            }

            long res = number % 3;
            if (res == 0) {
                return pow(3, number / 3);
            } else if (res == 1) {
                return (pow(3, number / 3 - 1) * 4) % mod;
            } else {
                return (pow(3, number / 3) * 2) % mod;
            }
        }

        public long pow(long m, long n) {
            long temp = 1;
            while (n != 0) {
                if ((n & 1) == 1) {
                    temp = (temp * m) % mod;
                }

                m = (m * m) % mod;
                n >>= 1;
            }

            return temp;
        }
    }
}
