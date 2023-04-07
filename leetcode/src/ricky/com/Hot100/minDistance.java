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
            if (word1.length() == 0 && word2.length() == 0) {
                return 0;
            }

            if (word1.length() == 0 || word2.length() == 0) {
                return word1.length() == 0 ? word2.length() : word1.length();
            }

            //int[i][j],前面的表示word1,后面的表示word2
            int[][] dp = new int[word1.length() + 1][word2.length() + 1];
            dp[0][0] = 0;
            //word2为0
            for (int i = 1; i <= word1.length(); i++) {
                dp[i][0] = dp[i - 1][0] + 1;
            }

            for (int i = 1; i <= word2.length(); i++) {
                dp[0][i] = dp[0][i - 1] + 1;
            }

            for (int i = 1; i <= word1.length(); i++) {
                for (int j = 1; j <= word2.length(); j++) {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                }
            }

            return dp[word1.length()][word2.length()];
        }
    }
}
