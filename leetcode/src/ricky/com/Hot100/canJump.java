package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/27 16:53
 */
public class canJump {
    /*55. 跳跃游戏
    给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
    数组中的每个元素代表你在该位置可以跳跃的最大长度。
    判断你是否能够到达最后一个下标。*/

    class Solution {
        public boolean canJump(int[] nums) {
            if (nums == null || nums.length == 0) {
                return false;
            }

            //jumpMax表示能跳的最远距离
            int jumpMax = nums[0];
            for (int i = 0; i < nums.length; i++) {
                //前提是可以跳到第i个位置
                if (jumpMax < i) {
                    return false;
                }

                jumpMax = Math.max(jumpMax, i + nums[i]);
                //跳到了结尾就可以结束了
                if (jumpMax >= nums.length - 1) {
                    return true;
                }
            }

            return false;
        }
    }
}
