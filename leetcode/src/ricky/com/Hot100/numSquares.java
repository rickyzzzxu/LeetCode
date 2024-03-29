package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/10 1:49
 */
public class numSquares {
    /*279. 完全平方数
    给你一个整数 n ，返回 和为 n 的完全平方数的最少数量 。
    完全平方数 是一个整数，其值等于另一个整数的平方；换句话说，其值等于一个整数自乘的积。
    例如，1、4、9 和 16 都是完全平方数，而 3 和 11 不是。*/
    class Solution {
        public int numSquares(int n) {
            int[] dp = new int[n + 1];
            dp[0] = 0;
            //由dp[i - j * j]到dp[i]只需要一个j*j，就是一步
            for (int i = 1; i <= n; i++) {
                //最坏的情况，全是一
                dp[i] = i;
                for (int j = 1; i - j * j >= 0; j++) {
                    dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
                }
            }

            return dp[n];
        }
    }
}
