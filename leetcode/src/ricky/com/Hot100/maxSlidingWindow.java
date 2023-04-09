package ricky.com.Hot100;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author xdg
 * @Date 2023/4/9 20:43
 */
public class maxSlidingWindow {
    /*239. 滑动窗口最大值
    给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
    你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
    返回 滑动窗口中的最大值 。*/
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int[] res = new int[nums.length - k + 1];
            Deque<Integer> queue = new LinkedList<>();
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                //维护一个递减的队列：queueFirst（头）-> queueLast（尾）
                while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
                    queue.pollLast();
                }

                queue.addLast(i);
                if (queue.peekLast() - queue.peekFirst() + 1 > k) {
                    queue.pollFirst();
                }

                if (i + 1 >= k) {
                    res[index++] = nums[queue.peekFirst()];
                }
            }

            return res;
        }
    }
}
