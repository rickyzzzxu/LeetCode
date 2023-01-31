package ricky.com.SwordOffer;

public class replaceSpace {
    /*请实现一个函数，把字符串 s 中的每个空格替换成"%20"。*/
    class Solution {
        public String replaceSpace(String s) {
            if(s.length() == 0){
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
