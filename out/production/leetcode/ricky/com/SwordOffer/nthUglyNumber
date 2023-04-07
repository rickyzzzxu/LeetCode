package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/1 0:16
 */
public class nthUglyNumber {
    /*剑指 Offer 49. 丑数
    我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。*/
    class Solution {
        public int nthUglyNumber(int n) {
            int[] dp = new int[n];
            dp[0] = 1;
            int a = 0;
            int b = 0;
            int c = 0;
            for (int i = 1; i < n; i++) {
                dp[i] = Math.min(Math.min(dp[a] * 2, dp[b] * 3), dp[c] * 5);
                if (dp[i] == dp[a] * 2) {
                    a++;
                }

                if (dp[i] == dp[b] * 3) {
                    b++;
                }

                if (dp[i] == dp[c] * 5) {
                    c++;
                }
            }

            return dp[n - 1];
        }
    }
}
