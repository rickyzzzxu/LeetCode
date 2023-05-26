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
            if (nums == null || nums.length == 0) {
                return new int[]{-1, -1};
            }

            int l = 0;
            int r = nums.length - 1;
            boolean flag = false;
            while (l <= r) {
                int mid = (r - l) / 2 + l;
                //这个if要分开写，不然后面的不会执行，超时
                if (target == nums[mid]) {
                    flag = true;
                }

                if (target > nums[mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            int start = r + 1;

            l = 0;
            r = nums.length - 1;
            while (l <= r) {
                int mid = (r - l) / 2 + l;
                if (target >= nums[mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            int end = l - 1;

            if (!flag) {
                return new int[]{-1, -1};
            } else {
                return new int[]{start, end};
            }
        }
    }
}
