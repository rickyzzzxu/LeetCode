package ricky.com.Hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author xdg
 * @Date 2023/3/27 16:30
 */
public class groupAnagrams {
    /* 49. 字母异位词分组
     给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
     字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。*/
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();
            for (int i = 0; i < strs.length; i++) {
                char[] arr = strs[i].toCharArray();
                Arrays.sort(arr);
                String key = String.valueOf(arr);
                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                    map.get(key).add(strs[i]);
                } else {
                    map.get(key).add(strs[i]);
                }
            }

            return new ArrayList<>(map.values());
        }
    }
}
