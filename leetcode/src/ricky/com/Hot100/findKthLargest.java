package ricky.com.Hot100;

import java.util.PriorityQueue;

/**
 * @Author xdg
 * @Date 2023/4/7 20:53
 */
public class findKthLargest {
    /*215. 数组中的第K个最大元素
    给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
    请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
    你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。*/
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
            for (int i = 0; i < nums.length; i++) {
                queue.add(nums[i]);
            }

            for (int i = 0; i < k - 1; i++) {
                queue.poll();
            }

            return queue.poll();
        }
    }
}
