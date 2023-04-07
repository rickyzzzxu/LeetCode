package ricky.com.Hot100;

import java.util.Stack;

/**
 * @Author xdg
 * @Date 2023/3/22 15:11
 */
public class longestValidParentheses {
    /*32. 最长有效括号
    给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。*/
    class Solution {
        public int longestValidParentheses(String s) {
            Stack<Integer> stack = new Stack<>();
            int res = 0;
            int start = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                        if (!stack.isEmpty()) {
                            res = Math.max(res, i - stack.peek());
                        } else {
                            res = Math.max(res, i - start + 1);
                        }
                    } else {
                        start = i + 1;
                    }
                }
            }

            return res;
        }
    }
}
