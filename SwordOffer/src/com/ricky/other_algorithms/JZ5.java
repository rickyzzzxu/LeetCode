package com.ricky.other_algorithms;

public class JZ5 {
    /*替换空格
            描述
    请实现一个函数，将一个字符串s中的每个空格替换成“%20”。
    例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。*/


    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param s string字符串
         * @return string字符串
         */
        public String replaceSpace (String s) {
            // write code here
            if(s == null || s.length() <= 0){
                return "";
            }

            StringBuilder str = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ' '){
                    str.append("%20");
                }else{
                    str.append(s.charAt(i));
                }
            }

            return str.toString();
        }
    }
}
