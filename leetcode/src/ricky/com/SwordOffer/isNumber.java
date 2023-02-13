package ricky.com.SwordOffer;

public class isNumber {

    /*数值（按顺序）可以分成以下几个部分：
    若干空格
    一个 小数 或者 整数
    （可选）一个 'e' 或 'E' ，后面跟着一个 整数
    若干空格
    小数（按顺序）可以分成以下几个部分：
    （可选）一个符号字符（'+' 或 '-'）
    下述格式之一：
    至少一位数字，后面跟着一个点 '.'
    至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
    一个点 '.' ，后面跟着至少一位数字
    整数（按顺序）可以分成以下几个部分：
   （可选）一个符号字符（'+' 或 '-'）
    至少一位数字*/
    class Solution {
        public boolean isNumber(String s) {
            s = s.trim();
            boolean isNum = false;
            boolean isE = false;
            boolean isDot = false;
            for(int i = 0; i < s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    isNum = true;
                }else if(s.charAt(i) == '.' && (isDot == false) && !isE){
                    isDot = true;
                }else if((s.charAt(i) == 'e' || s.charAt(i) == 'E') && (isNum && !isE)){
                    isE = true;
                    isNum = false;
                }else if(s.charAt(i) == '+' || s.charAt(i) == '-'){
                    if(i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E'){
                        return false;
                    }
                }else{
                    return false;
                }
            }

            return isNum;
        }
    }
}
