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
            if (s == null || s.length() == 0) {
                return 0;
            }

            //用来存放括号对应的下标
            Stack<Integer> stack = new Stack<>();
            int res = 0;
            int start = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                } else {
                    //pop之前都要检查栈是不是为空
                    if (!stack.isEmpty()) {
                        stack.pop();
                        if (!stack.isEmpty()) {
                            //因为上面stack.pop()，所以不用加1
                            res = Math.max(res, i - stack.peek());
                        }else{
                            //因为上面stack.pop()，为空了，要加1
                            res = Math.max(res, i - start + 1);
                        }
                    }else{
                        //此时i对应的右括号没法比配上了，起始位置变为了从i+1开始
                        start = i + 1;
                    }
                }
            }


            return res;
        }
    }
}
