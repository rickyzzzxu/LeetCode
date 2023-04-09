package ricky.com.Hot100;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author xdg
 * @Date 2023/4/4 14:00
 */
public class longestConsecutive {
    /*128. 最长连续序列
    给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
    请你设计并实现时间复杂度为 O(n) 的算法解决此问题。*/
    class Solution {
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }

            int res = 0;
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }

            for (int i = 0; i < nums.length; i++) {
                int temp = nums[i];
                if (!set.contains(temp - 1)) {
                    while (set.contains(temp)) {
                        temp++;
                    }

                    res = Math.max(res, temp - nums[i]);
                }
            }

            return res;
        }
    }
}
