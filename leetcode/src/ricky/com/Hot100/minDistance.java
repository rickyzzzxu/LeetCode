package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/29 18:32
 */
public class minDistance {
    /*72. 编辑距离
    给你两个单词 word1 和 word2， 请返回将 word1 转换成 word2 所使用的最少操作数  。
    你可以对一个单词进行如下三种操作：
    插入一个字符
    删除一个字符
    替换一个字符*/


    class Solution {
        public int minDistance(String word1, String word2) {
            if (word1.length() == 0 || word2.length() == 0) {
                return word1.length() == 0 ? word2.length() : word1.length();
            }

            int m = word1.length();
            int n = word2.length();
            //dp[i][j]表示word1第i个位置和word2第j个位置匹配上的最少操作数
            int[][] dp = new int[m + 1][n + 1];
            //都为空时
            dp[0][0] = 0;
            //word2为空，word1不为空
            for (int i = 1; i <= m; i++) {
                dp[i][0] = dp[i - 1][0] + 1;
            }
            //word1为空，word2不为空
            for (int i = 1; i <= n; i++) {
                dp[0][i] = dp[0][i - 1] + 1;
            }

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        //i和j位置上匹配上了，就等于前一个位置的操作数
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        //插入一个字符、删除一个字符、替换一个字符，取三者中的最小操作数，最后+1
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                }
            }

            return dp[m][n];
        }
    }
}
