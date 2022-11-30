package com.ricky.other_algorithms;

public class JZ49 {
    //丑数
    //        描述
    //把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
    //习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第 n个丑数。
    //数据范围：0 \le n \le 20000≤n≤2000
    //要求：空间复杂度 O(n)O(n) ， 时间复杂度 O(n)O(n)
    public class Solution {
        public int GetUglyNumber_Solution(int index) {
            if (index == 0) {
                return 0;
            }

            int[] dp = new int[index + 1];
            dp[1] = 1;
            int a = 1, b = 1, c = 1;
            for (int i = 2; i <= index; i++) {
                dp[i] = Math.min(Math.min(dp[a] * 2, dp[b] * 3), dp[c] * 5);
                if (dp[i] == dp[a] * 2) a++;
                if (dp[i] == dp[b] * 3) b++;
                if (dp[i] == dp[c] * 5) c++;
            }

            return dp[index];
        }
    }
}
