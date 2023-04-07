package ricky.com.Hot100;

import java.util.HashMap;

/**
 * @Author xdg
 * @Date 2023/3/13 10:51
 */
public class lengthOfLongestSubstring {
    /* 3. 无重复字符的最长子串
     给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。*/
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s.length() == 0) {
                return 0;
            }

            HashMap<Character, Integer> map = new HashMap<>();
            map.put(s.charAt(0), 0);
            int res = 1;
            int dp = 1;
            for (int i = 1; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    dp++;
                } else {
                    int k = map.get(s.charAt(i));
                    if (i - k > dp) {
                        dp++;
                    } else {
                        dp = i - k;
                    }
                }

                res = Math.max(dp, res);
                map.put(s.charAt(i), i);
            }

            return res;
        }
    }
}
