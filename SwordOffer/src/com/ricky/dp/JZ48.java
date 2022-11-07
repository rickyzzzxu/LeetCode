package com.ricky.dp;

import java.util.HashMap;

public class JZ48 {
    /*最长不含重复字符的子字符串
    描述
    请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。*/

    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param s string字符串
         * @return int整型
         */
        public int lengthOfLongestSubstring (String s) {
            // write code here
            if (s.length() <= 1) {
                return s.length();
            }
            //dp表示此时无重复字符最长子串的长度
            int dp = 1;
            int res = 1;
            //用来判断第i个字符是否出现过
            HashMap<Character, Integer> map = new HashMap<>();
            map.put(s.charAt(0), 0);
            for (int i = 1; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    dp = dp + 1;
                } else {
                    int k = map.get(s.charAt(i));
                    //判断重复的字符是否在dp区间内
                    if (dp >= i - k) {
                        dp = i - k;
                    } else {
                        dp = dp + 1;
                    }
                }
                map.put(s.charAt(i), i);
                //维护最大值
                res = Math.max(res, dp);
            }
            return res;
        }
    }
}
