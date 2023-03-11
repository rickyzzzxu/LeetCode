package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/5 23:01
 */
public class reverseWords {
    /*剑指 Offer 58 - I. 翻转单词顺序
    输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母
    一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。*/
    class Solution {
        public String reverseWords(String s) {
            s = s.trim();
            int i = s.length() - 1;
            int j = s.length() - 1;
            StringBuilder str = new StringBuilder();
            while (i >= 0 && j >= 0) {
                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                str.append(s.substring(i + 1, j + 1) + " ");
                j = i;
                while (i >= 0 && s.charAt(i) == ' ') {
                    i--;
                    j--;
                }
            }

            return str.toString().trim();
        }
    }
}
