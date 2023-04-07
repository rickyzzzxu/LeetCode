package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/23 16:36
 */
public class searchRange {
    /*34. 在排序数组中查找元素的第一个和最后一个位置
    给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
    如果数组中不存在目标值 target，返回 [-1, -1]。
    你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。*/
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int l = 0;
            int r = nums.length - 1;
            int start = 0;
            int end = 0;
            boolean flag = false;
            while (l <= r) {
                int mid = (l - r) / 2 + r;
                if (target < nums[mid]) {
                    r = mid - 1;
                } else {
                    if (nums[mid] == target) {
                        flag = true;
                    }
                    l = mid + 1;
                }
            }
            if (flag) {
                end = l - 1;
            } else {
                end = -1;
            }

            l = 0;
            r = nums.length - 1;
            flag = false;
            while (l <= r) {
                int mid = (l - r) / 2 + r;
                if (target <= nums[mid]) {
                    if (nums[mid] == target) {
                        flag = true;
                    }
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            if (flag) {
                start = r + 1;
            } else {
                start = -1;
            }

            return new int[]{start, end};
        }
    }
}
