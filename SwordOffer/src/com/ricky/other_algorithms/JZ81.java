package com.ricky.other_algorithms;

public class JZ81 {
    /*调整数组顺序使奇数位于偶数前面(二)
    描述
    输入一个长度为 n 整数数组，数组里面可能含有相同的元素，实现一个函数来调整该数组中数字的顺序，使
    得所有的奇数位于数组的前面部分，所有的偶数位于数组的后面部分，对奇数和奇数，偶数和偶数之间的相对
    位置不做要求，但是时间复杂度和空间复杂度必须如下要求。*/

    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param array int整型一维数组
         * @return int整型一维数组
         */
        public int[] reOrderArrayTwo (int[] array) {
            // write code here
            if (array == null || array.length <= 0) {
                return array;
            }

            int i = 0;
            int j = array.length - 1;
            int temp = 0;
            while (i < j) {
                while (i < j && array[i] % 2 == 1) i++;
                while (i < j && array[j] % 2 == 0) j--;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            return array;
        }
    }
}
