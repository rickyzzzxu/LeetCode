package ricky.com.SwordOffer;

public class myPow {
    /*实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。*/
    class Solution {
        public double myPow(double x, int n) {
            long temp = n;
            if(n < 0){
                temp = -temp;
                x = 1 / x;
            }

            double res = 1;
            while(temp != 0){
                if((temp & 1) == 1){
                    res *= x;
                }

                temp >>= 1;
                x *= x;
            }

            return res;
        }

    }
}
