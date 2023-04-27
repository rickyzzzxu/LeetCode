package ricky.com.SwordOffer;

import java.util.ArrayList;
import java.util.Arrays;

public class permutation {
    /*输入一个字符串，打印出该字符串中字符的所有排列。
    你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。*/
    class Solution {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean[] visited;

        public String[] permutation(String s) {
            if (s == null || s.length() == 0) {
                return new String[0];
            }

            visited = new boolean[s.length()];
            char[] str = s.toCharArray();
            Arrays.sort(str);
            dfs(str, 0);
            String[] res = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }

            return res;

        }

        private void dfs(char[] str, int k) {
            if (k == str.length) {
                list.add(sb.toString());
                return;
            }

            for (int i = 0; i < str.length; i++) {
                //同一路径上的话，就不用剪枝
                if (i > 0 && !visited[i - 1] && str[i] == str[i - 1]) {
                    continue;
                }

                if (!visited[i]) {
                    visited[i] = true;
                    sb.append(str[i]);
                    dfs(str, k + 1);
                    visited[i] = false;
                    sb.deleteCharAt(sb.length() - 1);
                }
            }

        }
    }
}
