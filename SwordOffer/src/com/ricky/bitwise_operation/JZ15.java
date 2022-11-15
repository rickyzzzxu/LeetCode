package com.ricky.bitwise_operation;

public class JZ15 {
    /*二进制中1的个数
            描述
    输入一个整数 n ，输出该数32位二进制表示中1的个数。其中负数用补码表示。*/
    public class Solution {
        public int NumberOf1(int n) {

        /*
        int count = 0;
        while(n != 0){
            count++;
            n = n & (n - 1);
        }
        return count;
        */


            int count = 0 ;
            for(int i = 0; i < 32; i++){
                if((n & 1) == 1){
                    count++;
                }
                n = n >> 1;
            }

            return count;
        }
    }
}
