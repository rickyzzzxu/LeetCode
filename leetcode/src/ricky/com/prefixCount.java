package ricky.com;

public class prefixCount {
    /*给你一个字符串数组 words 和一个字符串 pref 。
    返回 words 中以 pref 作为 前缀 的字符串的数目。
    字符串 s 的 前缀 就是  s 的任一前导连续字符串。*/
    class Solution {
        public int prefixCount(String[] words, String pref) {
            int res = 0;
            for(int i = 0; i < words.length; i++){
                if(words[i].startsWith(pref)){
                    res++;
                }
            }

            return res;
        }
    }
}
