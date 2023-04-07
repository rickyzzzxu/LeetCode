package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/31 12:15
 */
public class exist {
    /*79. 单词搜索
    给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
    单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
    */
    class Solution {
        boolean[][] visited;

        public boolean exist(char[][] board, String word) {
            visited = new boolean[board.length][board[0].length];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (dfs(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }

            return false;
        }

        private boolean dfs(char[][] board, String word, int i, int j, int k) {
            if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j] || word.charAt(k) != board[i][j]) {
                return false;
            }

            if (k == word.length() - 1) {
                return true;
            }

            visited[i][j] = true;
            boolean flag = dfs(board, word, i + 1, j, k + 1)
                    || dfs(board, word, i - 1, j, k + 1)
                    || dfs(board, word, i, j + 1, k + 1)
                    || dfs(board, word, i, j - 1, k + 1);
            visited[i][j] = false;
            return flag;
        }
    }

}
