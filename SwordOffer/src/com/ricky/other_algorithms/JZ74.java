package com.ricky.other_algorithms;

import java.util.ArrayList;

public class JZ74 {
    /*和为S的连续正数序列
            描述
    小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,
    他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:
    18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列?
    数据范围：0 < n \le 1000<n≤100
    进阶：时间复杂度 O(n)O(n)*/
    public class Solution {
        public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            if (sum == 0) {
                return res;
            }

            int l = 1, r = 2;
            while (l < r) {
                int sum1 = (l + r) * (r - l + 1) / 2;
                ArrayList<Integer> list = new ArrayList<>();
                if (sum1 == sum) {
                    for (int i = l; i <= r; i++) {
                        list.add(i);
                    }
                    res.add(list);
                    l++;
                } else if (sum1 < sum) {
                    r++;
                } else {
                    l++;
                }
            }

            return res;
        }
    }
}
