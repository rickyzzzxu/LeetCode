package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/30 16:20
 */
public class sortColors {
    /*75. 颜色分类
    给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
    我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
    必须在不使用库内置的 sort 函数的情况下解决这个问题。*/
    class Solution {
        //也可以先把0换到头部，再一次for循环交换1和2
        public void sortColors(int[] nums) {
            int count0 = 0;
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    count0++;
                } else if (nums[i] == 1) {
                    count1++;
                } else {
                    count2++;
                }
            }

            for (int i = 0; i < count0; i++) {
                nums[i] = 0;
            }

            for (int i = count0; i < count0 + count1; i++) {
                nums[i] = 1;
            }

            for (int i = count0 + count1; i < nums.length; i++) {
                nums[i] = 2;
            }

            return;
        }
    }
}
