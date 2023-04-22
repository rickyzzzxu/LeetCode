package ricky.com.Hot100;

import java.util.Stack;

/**
 * @Author xdg
 * @Date 2023/4/21 22:42
 */
public class decodeString {

    /*394. 字符串解码
    给定一个经过编码的字符串，返回它解码后的字符串。
    编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
    你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
    此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。*/
    class Solution {
        public String decodeString(String s) {
            if (s == null || s.length() == 0) {
                return "";
            }

            StringBuilder res = new StringBuilder();
            int time = 0;
            //用来存放字符串重复的倍数
            Stack<Integer> times = new Stack<>();
            //存放数字后面或者说'['后面的字符串
            Stack<String> topStrings = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    time = time * 10 + Integer.parseInt(s.charAt(i) + "");
                } else if (s.charAt(i) == '[') {
                    times.push(time);
                    topStrings.push(res.toString());
                    time = 0;
                    res = new StringBuilder();
                } else if (s.charAt(i) == ']') {
                    int topTime = times.pop();
                    StringBuilder tempString = new StringBuilder(topStrings.pop());
                    for (int j = 0; j < topTime; j++) {
                        tempString.append(res);
                    }
                    res = tempString;
                } else {
                    res.append(s.charAt(i));
                }

            }

            return res.toString();
        }
    }
}
