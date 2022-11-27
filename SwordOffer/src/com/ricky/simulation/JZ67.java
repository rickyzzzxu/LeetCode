package com.ricky.simulation;

public class JZ67 {
    /*把字符串转换成整数(atoi)
    描述
    写一个函数 StrToInt，实现把字符串转换成整数这个功能。不能使用 atoi 或者其他类似的库函数。传入
    的字符串可能有以下部分组成:
        1.若干空格
        2.（可选）一个符号字符（'+' 或 '-'）
        3. 数字，字母，符号，空格组成的字符串表达式
        4. 若干空格
    转换算法如下:
        1.去掉无用的前导空格
        2.第一个非空字符为+或者-号时，作为该整数的正负号，如果没有符号，默认为正数
        3.判断整数的有效部分：
        3.1 确定符号位之后，与之后面尽可能多的连续数字组合起来成为有效整数数字，如果没有有效的整数
        部分，那么直接返回0
        3.2 将字符串前面的整数部分取出，后面可能会存在存在多余的字符(字母，符号，空格等)，这些字符
        可以被忽略，它们对于函数不应该造成影响
        3.3  整数超过 32 位有符号整数范围 [−231,  231 − 1] ，需要截断这个整数，使其保持在这个范
        围内。具体来说，小于 −231的整数应该被调整为 −231 ，大于 231 − 1 的整数应该被调整为 231 − 1
        4.去掉无用的后导空格*/


    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param s string字符串
         * @return int整型
         */
        public int StrToInt (String s) {
            // write code here
            s = s.trim();
            if (s.length() == 0) {
                return 0;
            }

            char first = s.charAt(0);
            int sign = 1;
            int i = 0;

            //顺序不能反了，‘+’也不在0~9之间
            if (first == '+') {
                i++;
            } else if (first == '-') {
                sign = -1;
                i++;
            } else if (first < '0' || first > '9') {
                return 0;
            }


            long num = 0;
            while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num = num * 10 + Integer.parseInt(s.charAt(i) + "");
                if (num * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (num * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                i++;
            }
            return (int)(num * sign);
        }
    }

}
