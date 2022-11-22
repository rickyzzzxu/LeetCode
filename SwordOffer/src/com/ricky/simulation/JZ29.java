package com.ricky.simulation;

import java.util.ArrayList;

public class JZ29 {
    /*顺时针打印矩阵
            描述
    输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
            [[1,2,3,4],
            [5,6,7,8],
            [9,10,11,12],
            [13,14,15,16]]
    则依次打印出数字
    [1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10]*/
    public class Solution {
        public ArrayList<Integer> printMatrix(int [][] matrix) {
            ArrayList<Integer> list = new ArrayList<>();
            if (matrix.length == 0) {
                return list;
            }

            //四个边界
            int up = 0;
            int down = matrix.length - 1;
            int left = 0;
            int right = matrix[0].length - 1;

            while (up <= down && left <= right) {
                //上边界的从左到右
                for (int i = left; i <= right; i++) {
                    list.add(matrix[up][i]);
                }
                up++;
                if (up > down) {
                    break;
                }

                //右边界的从上到下
                for (int i = up; i <= down; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
                if (right < left) {
                    break;
                }

                //下边界的从右到左
                for (int i = right; i >= left; i--) {
                    list.add(matrix[down][i]);
                }
                down--;
                if (down < up) {
                    break;
                }

                //左边界的从下到上
                for (int i = down; i >= up; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
                if (down < up) {
                    break;
                }

            }

            return list;
        }
    }
}
