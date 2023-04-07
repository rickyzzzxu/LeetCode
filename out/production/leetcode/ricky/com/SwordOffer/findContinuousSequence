package ricky.com.SwordOffer;

import java.util.ArrayList;

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
            ArrayList<int[]> list = new ArrayList<>();
            int i = 1;
            int j = 2;
            int sum = 0;
            while (j < target) {
                sum = (i + j) * (j - i + 1) / 2;
                if (sum == target) {
                    int index = 0;
                    int[] temp = new int[j - i + 1];
                    for (int k = i; k <= j; k++) {
                        temp[index++] = k;
                    }
                    i++;
                    list.add(temp);
                } else if (sum > target) {
                    i++;
                } else {
                    j++;
                }
            }

            return list.toArray(new int[0][]);
        }
    }
}
