package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/6 20:53
 */
public class dicesProbability {
    /*剑指 Offer 60. n个骰子的点数
    把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出s的所有可能的值出现的概率。
    你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。*/
    class Solution {
        public double[] dicesProbability(int n) {
            //第i个骰子掷出点数为j能有多少种掷法
            int[][] dp = new int[n + 1][6 * n + 1];
            //初始化n=1时
            for (int i = 1; i <= 6; i++) {
                dp[1][i] = 1;
            }

            for (int i = 2; i <= n; i++) {
                for (int j = i; j <= 6 * n; j++) {
                    //dp[i][j]可以由i-1个骰子变过来，dp[2][4]=dp[1][1]+dp[1][2]+dp[1][3]+dp[1][4]的意思
                    //是可以由dp[1][1]+一个骰子掷3过来，也可以由dp[1][2]+一个骰子掷2过来+...+
                    for (int k = 1; k <= 6; k++) {
                        if (j > k) {
                            dp[i][j] += dp[i - 1][j - k];
                        }
                    }
                }
            }

            double[] res = new double[5 * n + 1];
            double sum = Math.pow(6, n);
            int index = 0;
            for (int i = n; i <= 6 * n; i++) {
                res[index++] = dp[n][i] / sum;
            }

            return res;
        }
    }
}
