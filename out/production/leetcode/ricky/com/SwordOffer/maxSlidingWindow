package ricky.com.SwordOffer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author xdg
 * @Date 2023/3/6 18:10
 */
public class maxSlidingWindow {
    /*给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
    示例:
    输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
    输出: [3,3,5,5,6,7]
    滑动窗口的位置                最大值
    ---------------               -----
    [1  3  -1] -3  5  3  6  7      3
    1 [3  -1  -3] 5  3  6  7       3
    1  3 [-1  -3  5] 3  6  7       5
    1  3  -1 [-3  5  3] 6  7       5
    1  3  -1  -3 [5  3  6] 7       6
    1  3  -1  -3  5 [3  6  7]      7*/
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int[] res = new int[nums.length - k + 1];
            Deque<Integer> queue = new LinkedList<>();
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                //维持队列递减
                while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                    queue.pollLast();
                }

                queue.add(i);
                //保证窗口大小为k
                if (queue.peekLast() - queue.peekFirst() + 1 > k) {
                    queue.pollFirst();
                }

                //把队头元素加入res（此时队头最大）
                if (i + 1 >= k) {
                    res[index++] = nums[queue.peekFirst()];
                }
            }

            return res;
        }
    }
}
