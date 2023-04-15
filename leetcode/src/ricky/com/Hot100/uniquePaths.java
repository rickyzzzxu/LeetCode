package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/28 18:38
 */
public class uniquePaths {
    /* 62. 不同路径
     一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
     机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
     问总共有多少条不同的路径？*/
    class Solution {
        public int uniquePaths(int m, int n) {
            //dp[i][j]表示到达ij位置有多少路径
            int[][] dp = new int[m][n];
            //第一行只有一条路径
            for (int i = 0; i < n; i++) {
                dp[0][i] = 1;
            }

            //第一列只有一条路径
            for (int i = 0; i < m; i++) {
                dp[i][0] = 1;
            }

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    //到达地ij位置，可以从上边或左边过来，所以要相加，表示总的路径
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }

            return dp[m - 1][n - 1];
        }
    }
}
