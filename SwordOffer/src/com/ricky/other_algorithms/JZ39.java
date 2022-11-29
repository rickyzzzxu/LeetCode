package com.ricky.other_algorithms;

import java.util.HashMap;

public class JZ39 {
    /*数组中出现次数超过一半的数字
            描述
    给一个长度为 n 的数组，数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
    例如输入一个长度为9的数组[1,2,3,2,2,2,5,4,2]。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。*/
    public class Solution {
        public int MoreThanHalfNum_Solution(int [] array) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int len = array.length / 2;
            for (int i = 0; i < array.length; i++) {
                if (!map.containsKey(array[i])) {
                    map.put(array[i], 1);
                } else {
                    map.put(array[i], map.get(array[i]) + 1);
                }

                if (map.get(array[i]) > len) {
                    return array[i];
                }
            }

            return 0;
        }
    }
}
