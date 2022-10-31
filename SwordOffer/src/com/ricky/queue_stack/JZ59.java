package com.ricky.queue_stack;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class JZ59 {
    /*滑动窗口的最大值
    描述
    给定一个长度为 n 的数组 num 和滑动窗口的大小 size ，找出所有滑动窗口里数值的最大值。
    例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他
    们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
    {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
    {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
    窗口大于数组长度或窗口长度为0的时候，返回空。
    数据范围： 1 \le n \le 100001≤n≤10000，0 \le size \le 100000≤size≤10000，
    数组中每个元素的值满足 |val| \le 10000∣val∣≤10000
    要求：空间复杂度 O(n)O(n)，时间复杂度 O(n)O(n)*/
    public class Solution {
        public ArrayList<Integer> maxInWindows(int [] num, int size) {
            ArrayList<Integer> list = new ArrayList<>();
            if (size > num.length || size == 0) {
                return list;
            }

            Deque<Integer> queue = new LinkedList<>();
            for (int i = 0; i < num.length; i++) {
                //num[1, 3, -1, -3, 5, 3, 6, 7]
                //下标[1, 2, 3],单调队列,保持队列递增
                while (!queue.isEmpty() && num[queue.peekLast()] < num[i]) {
                    queue.pollLast();
                }

                queue.add(i);
                //如果队列中元素超过size，把最先加入的下标poll()
                if (queue.peekLast() - queue.peekFirst() >= size) {
                    queue.pollFirst();
                }

                //滑动窗口向后移，并加入list中
                if (i + 1 >= size) {
                    list.add(num[queue.peekFirst()]);
                }
            }
            return list;
        }
    }

}
