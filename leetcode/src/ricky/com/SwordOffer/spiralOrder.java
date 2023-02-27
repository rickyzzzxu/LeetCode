package ricky.com.SwordOffer;

public class spiralOrder {
    /*剑指 Offer 29. 顺时针打印矩阵
    输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。*/
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            if (matrix.length == 0) {
                return new int[0];
            }

            int top = 0;
            int down = matrix.length - 1;
            int left = 0;
            int right = matrix[0].length - 1;
            int[] res = new int[(down + 1) * (right + 1)];
            int temp = 0;

            while (down >= top && left <= right) {
                for (int i = left; i <= right; i++) {
                    res[temp++] = matrix[top][i];
                }
                top++;
                if (down < top) {
                    break;
                }

                for (int i = top; i <= down; i++) {
                    res[temp++] = matrix[i][right];
                }
                right--;
                if (right < left) {
                    break;
                }

                for (int i = right; i >= left; i--) {
                    res[temp++] = matrix[down][i];
                }
                down--;
                if (down < top) {
                    break;
                }

                for (int i = down; i >= top; i--) {
                    res[temp++] = matrix[i][left];
                }
                left++;
                if (right < left) {
                    break;
                }
            }

            return res;
        }
    }
}
