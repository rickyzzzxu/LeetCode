package ricky.com.Hot100;

import java.util.Arrays;

/**
 * @Author xdg
 * @Date 2023/3/21 14:45
 */
public class nextPermutation {
    /*31. 下一个排列
    整数数组的一个 排列  就是将其所有成员以序列或线性顺序排列。
    例如，arr = [1,2,3] ，以下这些都可以视作 arr 的排列：[1,2,3]、[1,3,2]、[3,1,2]、[2,3,1] 。
    整数数组的 下一个排列 是指其整数的下一个字典序更大的排列。更正式地，如果数组的所有排列根据其字典顺序从小到大排列在一个容器中，那么数组的 下一个排列 就是在这个有序容器中排在它后面的那个排列。如果不存在下一个更大的排列，那么这个数组必须重排为字典序最小的排列（即，其元素按升序排列）。
    例如，arr = [1,2,3] 的下一个排列是 [1,3,2] 。
    类似地，arr = [2,3,1] 的下一个排列是 [3,1,2] 。
    而 arr = [3,2,1] 的下一个排列是 [1,2,3] ，因为 [3,2,1] 不存在一个字典序更大的排列。
    给你一个整数数组 nums ，找出 nums 的下一个排列。
    必须 原地 修改，只允许使用额外常数空间。*/
    class Solution {
        public void nextPermutation(int[] nums) {
            if (nums == null || nums.length == 0) {
                return;
            }

            for (int i = nums.length - 1; i >= 0; i--) {
                //为零的时候就说明输入的nums是最大的一种排列，这时候就需要输出最小的一种排列
                if (i == 0) {
                    Arrays.sort(nums);
                    return;
                }

                //从后往前找到第一个降序的数字
                if (nums[i] > nums[i - 1]) {
                    //对i-1后面的数字进行一个排序
                    Arrays.sort(nums, i, nums.length);
                    //从i-1后面的数字中找出第一个比nums[i-1]大的数字
                    for (int j = i; j < nums.length; j++) {
                        if (nums[j] > nums[i - 1]) {
                            int temp = nums[j];
                            nums[j] = nums[i - 1];
                            nums[i - 1] = temp;
                            //找到答案了就是直接返回
                            return;
                        }
                    }
                }
            }

        }
    }
}
