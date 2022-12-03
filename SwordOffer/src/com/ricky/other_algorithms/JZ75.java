package com.ricky.other_algorithms;

import java.util.HashMap;

public class JZ75 {
    /*字符流中第一个不重复的字符
            描述
    请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符 "go" 时，第一
    个只出现一次的字符是 "g" 。当从该字符流中读出前六个字符 “google" 时，第一个只出现一次的字符是"l"。*/
    public class Solution {
        //Insert one char from stringstream
        StringBuilder str = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        public void Insert(char ch) {
            str.append(ch);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        //return the first appearence once char in current stringstream
        public char FirstAppearingOnce() {
            for (int i = 0; i < str.length(); i++) {
                if (map.get(str.charAt(i)) == 1) {
                    return str.charAt(i);
                }
            }

            return '#';
        }
    }

}
