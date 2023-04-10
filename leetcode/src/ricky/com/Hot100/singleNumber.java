package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/4 15:54
 */
public class singleNumber {
    /*136. 只出现一次的数字
    给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。
    找出那个只出现了一次的元素。
    你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。*/
    class Solution {
        public int singleNumber(int[] nums) {
            int res = 0;
            for(int i = 0; i < nums.length; i++){
                res ^= nums[i];
            }

            return res;
        }
    }
}