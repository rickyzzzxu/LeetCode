package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/2 17:40
 */
public class search_I {
    /*剑指 Offer 53 - I. 在排序数组中查找数字 I
    统计一个数字在排序数组中出现的次数。*/
    class Solution {
        public int search(int[] nums, int target) {
            if (nums.length == 0) {
                return 0;
            }

            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                //int mid = (left - right) / 2 + left;
                int mid = (right + left) / 2;
                if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            int r = left;
            left = 0;
            right = nums.length - 1;
            while (left <= right) {
                //int mid = (left - right) / 2 + left;
                int mid = (right + left) / 2;
                if (nums[mid] >= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            int l = right;
            return r - l - 1;
        }
    }
}
