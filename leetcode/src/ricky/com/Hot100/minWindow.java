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
            if (s == null || s.length() == 0) {
                return "";
            }

            //把t中的每个字符出现的次数统计出来
            int[] arr = new int[128];
            for (int i = 0; i < t.length(); i++) {
                arr[t.charAt(i)]++;
            }

            int l = 0;
            int r = 0;
            //记录t中所有字符出现的次数，为0时说明找到一个答案
            int total = t.length();
            int len = Integer.MAX_VALUE;
            //字符串的起始位置
            int start = 0;
            for (r = 0; r < s.length(); r++) {
                //此时s.charAt(r)字符在t串中，total--
                if (arr[s.charAt(r)] > 0) {
                    total--;
                }
                //arr中t串中对应的字符数量也要减一，但它始终是>=0的，如果字符不在t串中，会减成负数
                arr[s.charAt(r)]--;

                //找到答案，记录
                while (total == 0) {
                    //因为是最小子串，所以取小值
                    if (len > r - l + 1) {
                        //字符串的长度
                        len = r - l + 1;
                        //记录起始位置
                        start = l;
                    }

                    //在将字符移出窗口之前，先要加1，不然移出后就晚了
                    arr[s.charAt(l)]++;
                    //如果移出去的字符是t串中的，total++
                    if (arr[s.charAt(l)] > 0) {
                        total++;
                    }
                    //窗口右移一位
                    l++;
                }

            }

            return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);

        }
    }
}
