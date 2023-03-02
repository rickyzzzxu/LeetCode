package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/2 23:08
 */
public class missingNumber {
    /*剑指 Offer 53 - II. 0～n-1中缺失的数字
    一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内
    的n个数字中有且只有一个数字不在该数组中，请找出这个数字。*/
    class Solution {
        public int missingNumber(int[] nums) {
            int left = 0;
            int rigth = nums.length - 1;
            while (left <= rigth) {
                int mid = (rigth - left) / 2 + left;
                if (nums[mid] == mid) {
                    left = mid + 1;
                } else {
                    rigth = mid - 1;
                }
            }

            return left;
        }
    }
}
