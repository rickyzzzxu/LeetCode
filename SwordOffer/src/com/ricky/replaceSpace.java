package com.ricky;

public class replaceSpace {
    /*请实现一个函数，把字符串 s 中的每个空格替换成"%20"。*/
    class Solution {
        public String replaceSpace(String s) {
            if(s == null){
                return null;
            }

            StringBuilder str = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != ' '){
                    str.append(s.charAt(i));
                }else{
                    str.append("%20");
                }
            }
            return str.toString();
        }
    }
}
