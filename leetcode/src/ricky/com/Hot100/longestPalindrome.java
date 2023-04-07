package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/14 15:00
 */
public class longestPalindrome {
    /* 5. 最长回文子串
     给你一个字符串 s，找到 s 中最长的回文子串。
     如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。*/
    class Solution {
        public String longestPalindrome(String s) {
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                int l = i - 1;
                int r = i + 1;
                while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                }
                if (res.length() < r - l - 1) {
                    res = s.substring(l + 1, r);
                }

                l = i;
                r = i + 1;
                while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                }
                if (res.length() < r - l - 1) {
                    res = s.substring(l + 1, r);
                }
            }

            return res;
        }
    }
}
