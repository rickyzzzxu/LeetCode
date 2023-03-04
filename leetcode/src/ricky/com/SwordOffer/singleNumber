package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/4 19:18
 */
public class singleNumber {
    /*剑指 Offer 56 - II. 数组中数字出现的次数 II
    在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。*/
    class Solution {
        public int singleNumber(int[] nums) {
            int[] temp = new int[32];
            int bit = 1;
            int res = 0;
            for (int i = 0; i < 32; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if ((nums[j] & bit) != 0) {
                        temp[i]++;
                    }
                }

                temp[i] %= 3;
                res += bit * temp[i];
                bit <<= 1;
            }

            return res;
        }
    }
}
