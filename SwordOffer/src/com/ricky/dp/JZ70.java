package com.ricky.dp;

public class JZ70 {
    /*矩形覆盖
    描述
    我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。请问用 n 个 2*1 的
    小矩形无重叠地覆盖一个 2*n 的大矩形，从同一个方向看总共有多少种不同的方法？*/
    public class Solution {
        public int rectCover(int target) {
            if(target == 0 || target == 1 || target == 2){
                return target;
            }

            //状态转移方程：f(n) = f(n - 1) + f(n - 2);
            int pre = 1;
            int cur = 2;
            int res = 0;
            for(int i = 2; i < target; i++){
                res = cur + pre;
                pre = cur;
                cur = res;
            }
            return res;
        }
    }

}
