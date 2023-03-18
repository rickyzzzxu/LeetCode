package ricky.com.Hot100;

import java.util.Stack;

/**
 * @Author xdg
 * @Date 2023/3/18 16:51
 */
public class isValid {
    /*20. 有效的括号
    给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
    有效字符串需满足：
    左括号必须用相同类型的右括号闭合。
    左括号必须以正确的顺序闭合。
    每个右括号都有一个对应的相同类型的左括号。*/
    class Solution {
        public boolean isValid(String s) {
            if (s.length() == 1) {
                return false;
            }

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    char top = stack.peek();
                    if (s.charAt(i) == ')' && top == '('
                            || s.charAt(i) == '}' && top == '{'
                            || s.charAt(i) == ']' && top == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }
    }
}
