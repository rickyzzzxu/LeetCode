package com.ricky.sparsearray;

public class SparseArray {

    public static void main(String[] args) {
        // 0表示没有棋子，1表示黑子，2表示白子
        int[][] arr1 = new int[11][11];
        arr1[1][2] = 1;
        arr1[2][3] = 2;
        // 输出原始棋盘
        for (int[] row : arr1) {
            for (int data : row) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }


    }

}
