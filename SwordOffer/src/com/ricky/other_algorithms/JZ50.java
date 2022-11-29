package com.ricky.other_algorithms;

import java.util.HashMap;

public class JZ50 {
    /*第一个只出现一次的字符
            描述
    在一个长为 字符串中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）*/
    public class Solution {
        public int FirstNotRepeatingChar(String str) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                if (!map.containsKey(str.charAt(i))) {
                    map.put(str.charAt(i), 1);
                } else {
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                }
            }

            for (int i = 0; i < str.length(); i++) {
                if (map.get(str.charAt(i)) == 1) {
                    return i;
                }
            }
            return -1;
        }
    }

}
