package ricky.com.Hot100;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @Author xdg
 * @Date 2023/4/11 21:00
 */
public class topKFrequent {
    /* 347. 前 K 个高频元素
     给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。*/
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (!map.containsKey(nums[i])) {
                    map.put(nums[i], 1);
                } else {
                    map.put(nums[i], map.get(nums[i]) + 1);
                }
            }


            //int[0]表示nums中的数字,int[1]表示数字对应的次数
            PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
            for (int key : map.keySet()) {
                int[] temp = new int[2];
                temp[0] = key;
                temp[1] = map.get(key);
                queue.add(temp);
            }

            int[] res = new int[k];
            for (int i = 0; i < k; i++) {
                res[i] = queue.poll()[0];
            }

            return res;
        }
    }
}
