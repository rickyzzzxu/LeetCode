package ricky.com.SwordOffer;

import java.util.Arrays;

/**
 * @Author xdg
 * @Date 2023/3/9 20:36
 */
public class minNumber {
    /*面试题45. 把数组排成最小的数
    输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。*/
    class Solution {
        public String minNumber(int[] nums) {
            String[] str = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                str[i] = nums[i] + "";
            }

            Arrays.sort(str, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < nums.length; i++) {
                res.append(str[i]);
            }

            return res.toString();
        }
    }
}
