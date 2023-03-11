package ricky.com.Hot100;

import java.util.HashMap;

/**
 * @Author xdg
 * @Date 2023/3/11 12:10
 */
public class twoSum {
    /*1. 两数之和
    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那
    两个 整数，并返回它们的数组下标。你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答
    案里不能重复出现。你可以按任意顺序返回答案。*/
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    return new int[]{i, map.get(target - nums[i])};
                }
                map.put(nums[i], i);
            }

            return new int[2];

        }
    }
}
