package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/10 11:24
 */
    public class moveZeroes {
    /*283. 移动零
    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    请注意 ，必须在不复制数组的情况下原地对数组进行操作。*/
    class Solution {
        public void moveZeroes(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    count++;
                }
            }

            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[index++] = nums[i];
                }
            }

            for (int i = nums.length - count; i < nums.length; i++) {
                nums[index++] = 0;
            }

            return;
        }
    }
}
