package ricky.com.SwordOffer;

public class findNumberIn2DArray {
    /*在一个 n * m 的二维数组中，每一行都按照从左到右 非递减 的顺序排序，每一列都按照从上到下 非递减
    的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。*/
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if(matrix.length == 0){
                return false;
            }

            int rows = matrix.length;
            int cols = matrix[0].length;
            int row = rows - 1;
            int col = 0;
            while(row >= 0 && col < cols){
                if(target == matrix[row][col]){
                    return true;
                }else if(target > matrix[row][col]){
                    col++;
                }else{
                    row --;
                }
            }

            return false;
        }
    }
}
