package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/9 21:06
 */
public class searchMatrix {
    /*240. 搜索二维矩阵 II
    编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
    每行的元素从左到右升序排列。
    每列的元素从上到下升序排列。*/
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
            int n = matrix[0].length;
            int row = m - 1;
            int col = 0;
            while (row >= 0 && col < n) {
                if (matrix[row][col] == target) {
                    return true;
                } else if (matrix[row][col] > target) {
                    row--;
                } else {
                    col++;
                }
            }

            return false;
        }
    }
}
