package ricky.com.SwordOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xdg
 * @Date 2023/3/4 22:22
 */
public class findContinuousSequence {
    /*剑指 Offer 57 - II. 和为s的连续正数序列
    输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
    序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。*/
    class Solution {
        public int[][] findContinuousSequence(int target) {
            if (target < 3) {
                return new int[0][];
            }

            List<int[]> list = new ArrayList<>();
            //记录起始位置
            int head = 1;
            //记录结束位置
            int tail = 2;
            int sum = 0;
            while (tail < target) {
                sum = (head + tail) * (tail - head + 1) / 2;
                if (sum == target) {
                    int[] temp = new int[tail - head + 1];
                    int index = 0;
                    for (int i = head; i <= tail; i++) {
                        temp[index++] = i;
                    }
                    list.add(temp);
                    //说明以head开头的序列结束了，head++
                    head++;
                } else if (sum > target) {
                    head++;
                } else {
                    tail++;
                }
            }

            int[][] res = new int[list.size()][];
            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }

            return res;

        }
    }
}
