package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/9 18:00
 */
public class productExceptSelf {
    /*238. 除自身以外数组的乘积
    给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
    题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
    请不要使用除法，且在 O(n) 时间复杂度内完成此题。*/
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            // 判断输入数组是否为空或长度为0，如果是则返回一个空数组
            if (nums == null || nums.length == 0) {
                return new int[0];
            }

            int m = nums.length;
            // 创建两个数组，用于记录每个位置左侧和右侧的乘积
            int[] left = new int[m];
            int[] right = new int[m];
            // 初始化左侧数组第一个元素为1，右侧数组最后一个元素为1
            left[0] = 1;
            right[m - 1] = 1;
            // 计算左侧数组每个位置的值，left[i]表示nums[0]~nums[i-1]的乘积
            for (int i = 1; i < m; i++) {
                left[i] = left[i - 1] * nums[i - 1];
            }

            // 计算右侧数组每个位置的值，right[i]表示nums[m-1]~nums[i+1]的乘积
            for (int i = m - 2; i >= 0; i--) {
                right[i] = right[i + 1] * nums[i + 1];
            }

            // 计算结果数组，即nums[i]等于left[i]和right[i]的乘积
            for (int i = 0; i < m; i++) {
                nums[i] = left[i] * right[i];
            }

            return nums;
        }
    }
}
