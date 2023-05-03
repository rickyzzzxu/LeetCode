package ricky.com.Hot100;

import java.util.*;

/**
 * @Author xdg
 * @Date 2023/3/16 18:22
 */
public class threeSum {
    /*15. 三数之和
    给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
    你返回所有和为 0 且不重复的三元组。
    注意：答案中不可以包含重复的三元组。*/
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> set = new HashSet<>();
            List<List<Integer>> res = new ArrayList<>();
            if (nums == null || nums.length < 3) {
                return res;
            }

            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                //从头和尾慢慢找
                int l = i + 1;
                int r = nums.length - 1;
                while (l < r) {
                    if (nums[i] + nums[l] + nums[r] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        set.add(list);
                        l++;
                        r--;
                    } else if (nums[i] + nums[l] + nums[r] > 0) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }

            res.addAll(set);

            return res;

        }
    }
}
