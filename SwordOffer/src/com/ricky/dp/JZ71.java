package com.ricky.dp;

public class JZ71 {
    /*跳台阶扩展问题
    描述
    一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级
    的台阶(n为正整数)总共有多少种跳法。*/
    public class Solution {
        public int jumpFloorII(int target) {
            if (target == 1 || target == 2) {
                return target;
            }

            //return jumpFloorII(target - 1) * 2;
            /*f(n)=f(n−1)+f(n−2)+...+f(n−(n−1))+f(n−n)=f(0)+f(1)+f(2)+...+f(n−1)，
            因为f(n−1)=f(n−2)+f(n−3)+...+f((n−1)−(n−2))+f((n−1)−(n−1))f(n-1)=
            f(n-2)+f(n-3)+...+f((n-1)-(n-2))+f((n-1)-(n-1))f(n−1)=f(n−2)+f(n−3)
            +...+f((n−1)−(n−2))+f((n−1)−(n−1))，
            经整理得f(n)=f(n−1)+f(n−1)=2∗f(n−1)f(n)=f(n-1)+f(n-1)=2*f(n-1)f(n)=
            f(n−1)+f(n−1)=2∗f(n−1)，因此每级台阶方案数是前面一级台阶方案数的2倍。*/
            int a = 2;
            int b = 0;
            for (int i = 2; i < target; i++) {
                b = 2 * a;
                a = b;
            }
            return b;
        }
    }

}
