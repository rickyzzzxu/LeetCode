package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/26 12:06
 */
public class rotate {
    /*48. 旋转图像
    给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
    你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。*/
    class Solution {
        public void rotate(int[][] matrix) {
            if (matrix.length == 0) {
                return;
            }

            //沿主对角线翻转,对角线左下角元素下标特点，i<j
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < i; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }


            //沿中心线翻转
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length / 2; j++) {
                    int len = matrix[i].length - 1 - j;
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][len];
                    matrix[i][len] = temp;
                }
            }

            return;
        }
    }
}
