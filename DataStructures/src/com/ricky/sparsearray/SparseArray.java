package com.ricky.sparsearray;

public class SparseArray {

    public static void main(String[] args) {
        // 0表示没有棋子，1表示黑子，2表示白子
        int[][] arr1 = new int[11][11];
        arr1[1][2] = 1;
        arr1[2][3] = 2;
        // 输出原始棋盘
        System.out.println("原始数组：");
        for (int[] row : arr1) {
            for (int data : row) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
        // 棋盘总共有多少个棋子
        int sum = 0;
        for (int[] row : arr1) {
            for (int data : row) {
                if (data != 0) {
                    sum++;
                }
            }
        }

        // 转化为稀疏数组
        int[][] sparseArr = new int[sum + 1][3];
        int count = 0;
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = arr1[i][j];
                }
            }
        }

        System.out.println("稀疏数组为：");
        for (int[] row : sparseArr) {
            for (int data : row) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }

        System.out.println("稀疏数组恢复为原始的数组：");
        int[][] arr2 = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 1; i < sparseArr.length; i++){
            for (int j = 1; j < sparseArr[i].length; j++){
                arr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
            }
        }

        for (int[] row : arr2) {
            for (int data : row) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }


    }

}
