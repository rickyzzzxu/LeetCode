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
        StringBuilder sb = new StringBuilder();
        int n;

        public List<String> generateParenthesis(int n) {
            if (n == 0) {
                return res;
            }

            this.n = n;
            dfs(0, 0, sb);
            return res;
        }

        private void dfs(int l, int r, StringBuilder sb) {
            if (l > n || r > n || r > l) {
                return;
            }
            if (sb.length() == n * 2) {
                res.add(sb.toString());
                return;
            }
            sb.append("(");
            dfs(l + 1, r, sb);
            sb.deleteCharAt(sb.length() - 1);
            sb.append(")");
            dfs(l, r + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
