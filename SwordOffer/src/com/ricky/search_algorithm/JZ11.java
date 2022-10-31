package com.ricky.search_algorithm;

public class JZ11 {
    /*旋转数组的最小数字
    描述
    有一个长度为 n 的非降序数组，比如[1,2,3,4,5]，将它进行旋转，即把
    一个数组最开始的若干个元素搬到数组的末尾，变成一个旋转数组，比如变成
    了[3,4,5,1,2]，或者[4,5,1,2,3]这样的。请问，给定这样一个旋转数组
    ，求数组中的最小值。
    数据范围：1 \le n \le 100001≤n≤10000，数组中任意元素的值: 0 \le val \le 100000≤val≤10000
    要求：空间复杂度：O(1)O(1) ，时间复杂度：O(logn)O(logn)*/
    public class Solution {
        public int minNumberInRotateArray(int [] array) {
            int l = 0;
            int r = array.length - 1;
            while (l < r) {
                //如果此时数组是严格递增的，直接返回最左边元素
                if (array[l] < array[r]) {
                    return array[l];
                }

                int mid = (l + r) / 2;
                //array[mid] > array[l]，说明mid在左边，更新l
                if (array[mid] > array[l]) {
                    l = mid + 1;
                    //array[mid] < array[l]，说明mid在右边，更新r
                } else if (array[mid] < array[l]) {
                    r = mid;
                    //mid=l，说明左边有连续多个相同的值，l后移一位
                } else {
                    l++;
                }
            }
            return array[l];
        }
    }

}
