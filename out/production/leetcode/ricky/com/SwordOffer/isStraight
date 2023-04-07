package ricky.com.SwordOffer;

import java.util.HashSet;

/**
 * @Author xdg
 * @Date 2023/3/10 13:04
 */
public class isStraight {
    /*面试题61. 扑克牌中的顺子
    从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身
    ，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。*/
    class Solution {
        public boolean isStraight(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            int max = 0;
            int min = 14;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    continue;
                }

                if (max < nums[i]) {
                    max = nums[i];
                }
                if (min > nums[i]) {
                    min = nums[i];
                }

                if (set.contains(nums[i])) {
                    return false;
                } else {
                    set.add(nums[i]);
                }
            }

            if (max - min >= 5) {
                return false;
            }

            return true;
        }
    }
}
