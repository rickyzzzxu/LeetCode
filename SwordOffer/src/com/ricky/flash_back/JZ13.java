package com.ricky.flash_back;

public class JZ13 {
    /*机器人的运动范围
            描述
    地上有一个 rows 行和 cols 列的方格。坐标从 [0,0] 到 [rows-1,cols-1] 。一个机器人
    从坐标 [0,0] 的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行
    坐标和列坐标的数位之和大于 threshold 的格子。 例如，当 threshold 为 18 时，机器人能
    够进入方格   [35,37] ，因为 3+5+3+7 = 18。但是，它不能进入方格 [35,38] ，
    因为 3+5+3+8 = 19 。请问该机器人能够达到多少个格子？*/
    public class Solution {
        boolean[][] visited;
        public int movingCount(int threshold, int rows, int cols) {
            visited = new boolean[rows][cols];
            return dfs(rows, cols, 0, 0, threshold);
        }

        private int dfs(int row, int col, int i, int j, int threshold) {
            if (i < 0 || i > row - 1 || j < 0 || j > col - 1 || visited[i][j] ||
                    threshold < sum(i) + sum(j)) {
                return 0;
            }

            visited[i][j] = true;
            return 1 + dfs(row, col, i, j + 1, threshold)
                    + dfs(row, col, i + 1, j, threshold)
                    + dfs(row, col, i, j - 1, threshold)
                    + dfs(row, col, i - 1, j, threshold);
        }

        private int sum(int x) {
            int res = 0;
            while (x != 0) {
                res = res + x % 10;
                x /= 10;
            }
            return res;
        }
    }

}
