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
            Arrays.sort(nums);
            Set<List<Integer>> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                int l = i + 1;
                int r = nums.length - 1;
                while (l < r) {
                    if (nums[l] + nums[r] + nums[i] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[l]);
                        list.add(nums[r]);
                        list.add(nums[i]);
                        set.add(list);
                        l++;
                        r--;
                    } else if (nums[l] + nums[r] + nums[i] < 0) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }

            List<List<Integer>> res = new ArrayList<>();
            res.addAll(set);
            return res;
        }
    }
}
