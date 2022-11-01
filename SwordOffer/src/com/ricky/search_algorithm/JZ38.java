package com.ricky.search_algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class JZ38 {
    /*字符串的排列
    描述
    输入一个长度为 n 字符串，打印出该字符串中字符的所有排列，你可以以任意顺序返回这个字符串数组。
    例如输入字符串ABC,则输出由字符A,B,C所能排列出来的所有字符串ABC,ACB,BAC,BCA,CBA和CAB。*/
    public class Solution {
        ArrayList<String> res = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();
        boolean[] visited;
        public ArrayList<String> Permutation(String str) {
            if (str.length() == 0) {
                res.add("");
                return res;
            }

            visited = new boolean[str.length()];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            dfs(chars, 0);

            return res;
        }

        void dfs(char[] arr, int k){
            //搜索到底，把一条路径加入到res集合中
            if(arr.length == k){
                res.add(charToString(list));
                return;
            }

            //剪枝。
            for(int i = 0; i < arr.length; i++){
                //从第二个字符开始，如果连续两个字符一样并且上一个没被访问过，说明arr[i]和arr[i - 1]在同一层，剪枝
                if(i > 0 && arr[i] == arr[i - 1] && visited[i - 1] == false){
                    continue;
                }

                if(visited[i] == false){
                    visited[i] = true;
                    list.add(arr[i]);
                    dfs(arr, k + 1);
                    //回溯
                    list.remove(list.size() - 1);
                    visited[i] = false;
                }
            }
        }

        //把字符型集合转化为字符串
        String charToString(ArrayList<Character> list){
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < list.size(); i++){
                str.append(list.get(i));
            }
            return str.toString();
        }
    }
}
