package com.ricky;

public class exchange {
    /*输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部
    分，所有偶数在数组的后半部分。*/
    class Solution {
        public int[] exchange(int[] nums) {
            int i = 0;
            int j = nums.length - 1;
            int temp = 0;
            while(i < j){
                while(i < j && (nums[i] % 2) == 1) i++;
                while(i < j && (nums[j] % 2) == 0) j--;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            return nums;
        }
    }
}
