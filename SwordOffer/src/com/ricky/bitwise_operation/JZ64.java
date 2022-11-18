package com.ricky.bitwise_operation;

public class JZ64 {
    /*求1+2+3+...+n
            描述
    求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
    数据范围： 0 < n \le 2000<n≤200
    进阶： 空间复杂度 O(1)O(1) ，时间复杂度 O(n)O(n)*/
    public class Solution {
        public int Sum_Solution(int n) {
            int sum = n;
            boolean flag = (n > 0) && (sum += Sum_Solution(n - 1)) > 0;
            return sum;
        }
    }
}
