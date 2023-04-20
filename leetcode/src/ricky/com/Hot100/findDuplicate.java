package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/10 13:38
 */
public class findDuplicate {
    /*287. 寻找重复数
    给定一个包含 n + 1 个整数的数组 nums ，其数字都在 [1, n] 范围内（包括 1 和 n），可知至少存在一个重复的整数。
    假设 nums 只有 一个重复的整数 ，返回 这个重复的数 。
    你设计的解决方案必须 不修改 数组 nums 且只用常量级 O(1) 的额外空间。*/
    class Solution {
        public int findDuplicate(int[] nums) {
            if (nums == null || nums.length == 0) {
                return -1;
            }

            //初始化起始位置
            int slow = nums[0];
            int fast = nums[nums[0]];
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }

            //起始位置
            fast = 0;
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }

            return fast;

        }
    }
}
