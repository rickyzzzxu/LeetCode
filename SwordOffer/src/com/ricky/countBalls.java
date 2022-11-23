package com.ricky;

public class countBalls {
    /*你在一家生产小球的玩具厂工作，有 n 个小球，编号从 lowLimit 开始，到 highLimit 结
    束（包括 lowLimit 和 highLimit ，即 n == highLimit - lowLimit + 1）。另有
    无限数量的盒子，编号从 1 到 infinity 。
    你的工作是将每个小球放入盒子中，其中盒子的编号应当等于小球编号上每位数字的和。例如，编
    号 321 的小球应当放入编号 3 + 2 + 1 = 6 的盒子，而编号 10 的小球应当放入编号
    1 + 0 = 1 的盒子。给你两个整数 lowLimit 和 highLimit ，返回放有最多小球的盒子中的
    小球数量。如果有多个盒子都满足放有最多小球，只需返回其中任一盒子的小球数量。*/
    class Solution {
        public int countBalls(int lowLimit, int highLimit) {
            int[] res = new int[50];
            int max = 0;
            for(int i = lowLimit; i <= highLimit; i++){
                int temp = 0;
                int j = i;
                while(j != 0){
                    temp += j % 10;
                    j /= 10;
                }
                res[temp]++;
            }

            for(int i = 0; i < res.length; i++){
                if(max < res[i]){
                    max = res[i];
                }
            }
            return max;
        }
    }
}
