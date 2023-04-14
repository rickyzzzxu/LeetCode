package ricky.com.Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xdg
 * @Date 2023/3/18 17:31
 */
public class generateParenthesis {
    /*22. 括号生成
    数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。*/
    class Solution {
        List<String> res = new ArrayList<>();

        public List<String> generateParenthesis(int n) {
            StringBuilder sb = new StringBuilder();
            dfs(sb, 0, 0, n);
            return res;
        }

        private void dfs(StringBuilder sb, int l, int r, int n) {
            //当右括号多余左括号时退出
            if (l > n || r > n || r > l) {
                return;
            }

            if (sb.length() == n * 2) {
                res.add(sb.toString());
            }

            //先拼个左括号
            sb.append('(');
            dfs(sb, l + 1, r, n);
            sb.deleteCharAt(sb.length() - 1);
            //然后拼个右括号
            sb.append(')');
            dfs(sb, l, r + 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
