package com.ricky.other_algorithms;

import java.util.ArrayList;

public class JZ57 {
    /*和为S的两个数字
            描述
    输入一个升序数组 array 和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，
    返回任意一组即可，如果无法找出这样的数字，返回一个空数组即可。*/
    public class Solution {
        public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
            ArrayList<Integer> list = new ArrayList<>();
            if (array == null || array.length <= 1) {
                return list;
            }

            int l = 0, r = array.length - 1;
            while (l < r) {
                int temp = array[l] + array[r];
                if (temp == sum) {
                    list.add(array[l]);
                    list.add(array[r]);
                    return list;
                } else if (temp < sum) {
                    l++;
                } else {
                    r--;
                }
            }

            return list;
        }
    }
}
