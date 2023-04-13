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
        String[] str = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>();

        public List<String> letterCombinations(String digits) {
            if (digits == null || digits.length() == 0) {
                return res;
            }

            StringBuilder sb = new StringBuilder();
            dfs(digits, sb, 0);
            return res;
        }

        private void dfs(String digits, StringBuilder sb, int k) {
            if (k == digits.length()) {
                res.add(sb.toString());
                return;
            }

            //以每一个数字为起点，把每个元素对应的字符串中的每一个字符都遍历一遍
            int index = digits.charAt(k) - '2';
            for (int i = 0; i < str[index].length(); i++) {
                sb.append(str[index].charAt(i));
                dfs(digits, sb, k + 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }

    }
}
