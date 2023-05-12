package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/10 17:18
 */
public class lengthOfLIS {
    /*300. 最长递增子序列
    给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
    子序列 是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7]
    是数组 [0,3,1,6,2,2,7] 的子序列。*/
    class Solution {
        public int lengthOfLIS(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }

            int[] dp = new int[nums.length];
            dp[0] = 1;
            int res = 1;
            for (int i = 1; i < nums.length; i++) {
                dp[i] = 1;
                for (int j = 0; j < i; j++) {
                    //j可以接在i后面
                    if (nums[i] > nums[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }

                res = Math.max(res, dp[i]);
            }

            return res;
        }
    }
}
