package ricky.com.Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xdg
 * @Date 2023/3/17 12:33
 */
public class letterCombinations {
    /*17. 电话号码的字母组合
    给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
    给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。*/


    class Solution {
        List<String> res = new ArrayList<>();
        String[] str = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder sb = new StringBuilder();

        public List<String> letterCombinations(String digits) {
            if (digits == null || digits.length() == 0) {
                return res;
            }

            dfs(digits, 0);
            return res;
        }

        private void dfs(String digits, int k) {
            if (digits.length() == sb.length()) {
                res.add(sb.toString());
                return;
            }

            int index = digits.charAt(k) - '2';
            for (int i = 0; i < str[index].length(); i++) {
                sb.append(str[index].charAt(i));
                dfs(digits, k + 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
