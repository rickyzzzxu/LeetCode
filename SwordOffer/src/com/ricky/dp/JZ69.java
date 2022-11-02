package com.ricky.dp;

public class JZ69 {
    /*跳台阶
    描述
    一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个 n 级的台阶总共有多少种
    跳法（先后次序不同算不同的结果）。*/
    public class Solution {
        public int jumpFloor(int target) {
        /*if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        //递归公式：f(n)=f(n-1)+f(n-2)，跳到第n阶，只能是从n-1或n-2跳过来。
        return jumpFloor(target - 1) + jumpFloor(target - 2);*/
            if (target == 1) {
                return 1;
            }
            if (target == 2) {
                return 2;
            }

            int a = 1;
            int b = 2;
            int c = 0;
            for (int i = 2; i < target; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}
