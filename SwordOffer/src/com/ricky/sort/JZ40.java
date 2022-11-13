package com.ricky.sort;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class JZ40 {
    /*最小的K个数
            描述
    给定一个长度为 n 的可能有重复值的数组，找出其中不去重的最小的 k 个数。例如数组元素
    是4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4(任意顺序皆可)。
    要求：空间复杂度 O(n)O(n) ，时间复杂度 O(nlogk)O(nlogk)*/

    public class Solution {
        public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
            ArrayList<Integer> list = new ArrayList<>();
            if (input.length == 0 || k == 0) {
                return list;
            }

            // o1 - o2为小顶堆，o2-o1为大顶堆
            PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);

            for (int i = 0; i < input.length; i++) {
                queue.add(input[i]);
                if (queue.size() > k) {
                    queue.poll();
                }
            }

            while (!queue.isEmpty()) {
                list.add(0, queue.poll());
            }
            return list;
        }
    }
}
