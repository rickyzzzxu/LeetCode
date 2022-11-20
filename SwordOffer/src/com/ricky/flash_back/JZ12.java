package com.ricky.flash_back;

public class JZ12 {
    /*矩阵中的路径
    请设计一个函数，用来判断在一个n乘m的矩阵中是否存在一条包含某长度为len的字符串所有字符的路径。
    路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。如果
    一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子
            示例1
    输入：
            [[a,b,c,e],[s,f,c,s],[a,d,e,e]],"abcced"
    返回值：
            true*/

    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param matrix char字符型二维数组
         * @param word string字符串
         * @return bool布尔型
         */
        boolean[][] visited;
        public boolean hasPath (char[][] matrix, String word) {
            // write code here
            int n = matrix.length;
            int m = matrix[0].length;
            visited = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (dfs(matrix, word, i, j, 0)) {
                        return true;
                    }
                }
            }

            return false;
        }

        private boolean dfs(char[][] array, String word, int i, int j, int k) {
            if (i < 0 || i > array.length - 1 || j < 0 || j > array[0].length - 1 ||
                    visited[i][j] || array[i][j] != word.charAt(k)) {
                return false;
            }

            visited[i][j] = true;
            if (array[i][j] == word.charAt(k)) {
                return true;
            }

            boolean res = dfs(array, word, i, j + 1, k + 1)
                    || dfs(array, word, i + 1, j, k + 1)
                    || dfs(array, word, i, j - 1, k + 1)
                    || dfs(array, word, i - 1, j, k + 1);
            visited[i][j] = false;
            return res;
        }
    }
}
