package ricky.com.SwordOffer;

import java.util.HashMap;

/**
 * @Author xdg
 * @Date 2023/3/1 16:00
 */
public class firstUniqChar {
    /*剑指 Offer 50. 第一个只出现一次的字符
    在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。*/
    class Solution {
        public char firstUniqChar(String s) {
            if (s.length() == 0) {
                return ' ';
            }

            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), 1);
                } else {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                }
            }

            for (int i = 0; i < s.length(); i++) {
                if (map.get(s.charAt(i)) == 1) {
                    return s.charAt(i);
                }
            }

            return ' ';
        }
    }
}
