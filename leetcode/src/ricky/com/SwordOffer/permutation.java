package ricky.com.SwordOffer;

import java.util.ArrayList;
import java.util.Arrays;

public class permutation {
    /*输入一个字符串，打印出该字符串中字符的所有排列。
    你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。*/
    class Solution {
        ArrayList<String> res = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        boolean[] visited;
        public String[] permutation(String s) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            visited = new boolean[chars.length];
            dfs(chars, 0);
            String[] s1 = new String[res.size()];
            for(int i = 0; i < s1.length; i++){
                s1[i] = res.get(i);
            }

            return s1;
        }

        public void dfs(char[] chars, int k){
            if(k == chars.length){
                res.add(str.toString());
            }

            for(int i = 0; i < chars.length; i++){
                if(i > 0 && chars[i] == chars[i - 1] && visited[i - 1] == false){
                    continue;
                }

                if(!visited[i]){
                    visited[i] = true;
                    str.append(chars[i]);
                    dfs(chars, k + 1);
                    str.deleteCharAt(str.length() - 1);
                    visited[i] = false;
                }
            }
        }
    }
}
