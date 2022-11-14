package com.ricky.bitwise_operation;

public class JZ65 {
    /*不用加减乘除做加法
            描述
    写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
    数据范围：两个数都满足 -10 \le n \le 1000−10≤n≤1000
    进阶：空间复杂度 O(1)O(1)，时间复杂度 O(1)O(1)*/
    public class Solution {
        public int Add(int num1,int num2) {
            //表示不进位运算结果
            int sum1;
            //进位运算结果
            int sum2;
            //不再发生进位时，结束
            while(num2 != 0){
                sum1 = num1 ^ num2;
                sum2 = (num1 & num2) << 1;
                num1 = sum1;
                num2 = sum2;
            }
            return num1;
        }
    }
}
