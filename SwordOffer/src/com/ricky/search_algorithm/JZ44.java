package com.ricky.search_algorithm;

public class JZ44 {
    /*数字序列中某一位的数字
    描述
    数字以 0123456789101112131415... 的格式作为一个字符序列，在这个序列中
    第 2 位（从下标 0 开始计算）是 2 ，第 10 位是 1 ，第 13 位是 1 ，以此
    类题，请你输出第 n 位对应的数字。*/

    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param n int整型
         * @return int整型
         */
        public int findNthDigit (int n) {
            // write code here
            //bit记录某个数字是多少位的：123是3位，12是2位
            int bit = 1;
            //初始值：1~9为1,10~99为10,100~999为100
            long start = 1;
            //某个范围有多少个数字，1~9有9个,10~99有90个,100~999有900个
            long count = 9;
            if (n == 0) {
                return 0;
            }

            //找出是多少位的（范围）
            while (n > count) {
                n -= count;
                bit++;
                start *= 10;
                count = bit * start * 9;
            }

            //找出具体是那个数字
            String num = (start + (n - 1) / bit) + "";
            //获取那个数字的下标
            int index = (n - 1) % bit;
            return Integer.parseInt(num.charAt(index) + "");
        }
    }
}
