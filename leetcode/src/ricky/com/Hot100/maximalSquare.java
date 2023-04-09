package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/9 17:28
 */
public class maximalSquare {
    /*221. 最大正方形
    在一个由 '0' 和 '1' 组成的二维矩阵内，找到只包含 '1' 的最大正方形，并返回其面积。*/
    class Solution {
        public int maximalSquare(char[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int res = 0;
            int[][] dp = new int[m][n];
            for (int i = 0; i < n; i++) {
                dp[0][i] = matrix[0][i] - '0';
                res = Math.max(res, dp[0][i]);
            }

            for (int j = 0; j < m; j++) {
                dp[j][0] = matrix[j][0] - '0';
                res = Math.max(res, dp[j][0]);
            }

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] == '1') {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                        res = Math.max(res, dp[i][j]);
                    }
                }
            }

            return res * res;
        }
    }
}
