package com.ricky.bitwise_operation;

public class JZ16 {
    /*数值的整数次方
            描述
    实现函数 double Power(double base, int exponent)，求base的exponent次方。
    注意：
        1.保证base和exponent不同时为0。
        2.不得使用库函数，同时不需要考虑大数问题
        3.有特殊判题，不用考虑小数点后面0的位数。*/
    public class Solution {
        public double Power(double base, int exponent) {
            if (exponent < 0) {
                base = 1 / base;
                exponent = -exponent;
            }

            double res = 1;
            while (exponent > 0) {
                //exponent=13=8+4+1=1101
                if ((exponent & 1) == 1) {
                    res *= base;
                }

                base *= base;
                exponent = exponent >> 1;
            }
            return res;
        }
    }

}
