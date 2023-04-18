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
            if (matrix == null || matrix.length == 0) {
                return 0;
            }

            int m = matrix.length;
            int n = matrix[0].length;
            //dp[i][j]表示以i,j结尾构成的最大正方形，所以不能直接返回dp[m-1][n-1];（万一最后一个不是以1结尾）
            int[][] dp = new int[m][n];
            int res = 0;
            //初始化第一行，只要matrix[0][i]为什么，dp[0][i]就是什么，最大为1,
            for (int i = 0; i < n; i++) {
                dp[0][i] = matrix[0][i] - '0';
                res = Math.max(res, dp[0][i]);
            }

            //初始化第一列，只要matrix[i][0]为什么，dp[i][0]就是什么，最大为1,
            for (int i = 0; i < m; i++) {
                dp[i][0] = matrix[i][0] - '0';
                res = Math.max(res, dp[i][0]);
            }

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] == '1') {
                        //取三者最小的一个，假设我们用Math.max来更新dp数组，那么意味着只要有一个位置为0，当前位置的dp值就会被置为1，这显然是不正确的。
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                        res = Math.max(res, dp[i][j]);
                    }
                }
            }

            return res * res;
        }
    }
}
