package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/30 20:18
 */
public class minWindow {
    /*76. 最小覆盖子串
    给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
    注意：
    对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
    如果 s 中存在这样的子串，我们保证它是唯一的答案。*/
    class Solution {
        public String minWindow(String s, String t) {
            int[] arr = new int[256];
            for (int i = 0; i < t.length(); i++) {
                arr[t.charAt(i)]++;
            }

            int l = 0;
            int r = 0;
            int start = 0;
            int len = Integer.MAX_VALUE;
            int total = t.length();
            for (r = 0; r < s.length(); r++) {
                if (arr[s.charAt(r)] > 0) {
                    total--;
                }
                arr[s.charAt(r)]--;

                while (total == 0) {
                    if (len > r - l + 1) {
                        len = r - l + 1;
                        start = l;
                    }

                    arr[s.charAt(l)]++;
                    if (arr[s.charAt(l)] > 0) {
                        total++;
                    }
                    l++;
                }
            }

            return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
        }
    }
}
