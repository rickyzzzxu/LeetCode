package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/4 15:58
 */
public class singleNumbers {
    /*剑指 Offer 56 - I. 数组中数字出现的次数
    一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一
    次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。*/
    class Solution {
        public int[] singleNumbers(int[] nums) {
            int temp = 0;
            for (int i = 0; i < nums.length; i++) {
                temp ^= nums[i];
            }

            int m = 1;
            while ((m & temp) == 0) {
                m <<= 1;
            }

            int x = 0;
            int y = 0;
            for (int i = 0; i < nums.length; i++) {
                if ((m & nums[i]) == 0) {
                    x ^= nums[i];
                } else {
                    y ^= nums[i];
                }
            }

            return new int[]{x, y};
        }
    }
}
