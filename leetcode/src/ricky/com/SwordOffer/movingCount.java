package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/9 18:43
 */
public class movingCount {
    /*面试题13. 机器人的运动范围
    地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
    它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
    例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为
    3+5+3+8=19。请问该机器人能够到达多少个格子？*/
    class Solution {
        int res = 0;
        boolean[][] visited;
        int m;
        int n;

        public int movingCount(int m, int n, int k) {
            int sum = 0;
            visited = new boolean[m][n];
            this.m = m;
            this.n = n;
            dfs(0, 0, k);
            return res;
        }

        private void dfs(int i, int j, int k) {
            //i和j的范围必须在前面就判断，因为后面有个visited[i][j]可能会越界
            if (i < 0 || j < 0 || i > m - 1 || j > n - 1 || visited[i][j] || sum(i) + sum(j) > k) {
                return;
            }

            visited[i][j] = true;
            res++;
            dfs(i - 1, j, k);
            dfs(i + 1, j, k);
            dfs(i, j - 1, k);
            dfs(i, j + 1, k);
            //不能回头，所以不需要回溯
            //visited[i][j] = false;
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
