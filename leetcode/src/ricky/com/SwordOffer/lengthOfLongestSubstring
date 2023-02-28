package ricky.com.SwordOffer;

import java.util.HashMap;

/**
 * @Author xdg
 * @Date 2023/2/28 20:36
 */
public class lengthOfLongestSubstring {
    /*剑指 Offer 48. 最长不含重复字符的子字符串
    请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。*/
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s.length() == 0) {
                return 0;
            }

            int dp = 1;
            HashMap<Character, Integer> map = new HashMap<>();
            map.put(s.charAt(0), 0);
            int res = 1;
            for (int i = 1; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    dp = dp + 1;
                } else {
                    int k = i - map.get(s.charAt(i));
                    if (k > dp) {
                        dp = dp + 1;
                    } else {
                        dp = k;
                    }
                }

                res = Math.max(res, dp);
                map.put(s.charAt(i), i);
            }

            return res;
        }
    }
}
