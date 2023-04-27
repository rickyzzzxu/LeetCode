package ricky.com.SwordOffer;

public class majorityElement {
    /*数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
    你可以假设数组是非空的，并且给定的数组总是存在多数元素。*/
    class Solution {
        public int majorityElement(int[] nums) {
            //记录vote的得票数
            int count = 0;
            //记录候选人
            int vote = 0;
            for (int i = 0; i < nums.length; i++) {
                if (count == 0) {
                    vote = nums[i];
                }

                if (nums[i] == vote) {
                    count++;
                } else {
                    count--;
                }
            }

            return vote;
        }
    }
}
