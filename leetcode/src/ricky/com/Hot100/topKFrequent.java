package ricky.com.Hot100;

import java.util.HashMap;
import java.util.Map;
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
            if (nums == null || nums.length == 0 || k == 0) {
                return new int[0];
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (!map.containsKey(nums[i])) {
                    map.put(nums[i], 1);
                } else {
                    map.put(nums[i], map.get(nums[i]) + 1);
                }
            }

            PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                //不能在外面定义，queue存的是引用
                int[] temp = new int[2];
                temp[0] = entry.getKey();
                temp[1] = entry.getValue();
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
