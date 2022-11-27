package com.ricky.simulation;

public class JZ20 {
    /*表示数值的字符串
            描述
    请实现一个函数用来判断字符串str是否表示数值（包括科学计数法的数字，小数和整数）。
    科学计数法的数字(按顺序）可以分成以下几个部分:
            1.若干空格
            2.一个整数或者小数
            3.（可选）一个 'e' 或 'E' ，后面跟着一个整数(可正可负)
            4.若干空格
            小数（按顺序）可以分成以下几个部分：
            1.若干空格
            2.（可选）一个符号字符（'+' 或 '-'）
            3. 可能是以下描述格式之一:
            3.1 至少一位数字，后面跟着一个点 '.'
            3.2 至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
            3.3 一个点 '.' ，后面跟着至少一位数字
            4.若干空格
             整数（按顺序）可以分成以下几个部分：
            1.若干空格
            2.（可选）一个符号字符（'+' 或 '-')
            3. 至少一位数字
            4.若干空格
    例如，字符串["+100","5e2","-123","3.1416","-1E-16"]都表示数值。
    但是["12e","1a3.14","1.2.3","+-5","12e+4.3"]都不是数值。*/
    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param str string字符串
         * @return bool布尔型
         */
        public boolean isNumeric (String str) {
            // write code here
            str = str.trim();
            if (str.length() == 0) {
                return false;
            }

            boolean isNum = false;
            boolean isDot = false;
            boolean isE = false;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    isNum = true;
                } else if (str.charAt(i) == '.' && !isE && !isDot) {
                    isDot = true;
                } else if ((str.charAt(i) == 'e' || str.charAt(i) == 'E') && !isE && isNum) {
                    isE = true;
                    isNum = false;
                } else if ((str.charAt(i) == '-' || str.charAt(i) == '+') && (i == 0 || str.charAt(i - 1) == 'e' || str.charAt(i - 1) == 'E')) {

                } else {
                    return false;
                }
            }

            return isNum;
        }
    }
}
