package ricky.com;

public class majorityElement {
    /*数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
    你可以假设数组是非空的，并且给定的数组总是存在多数元素。*/
    class Solution {
        public int majorityElement(int[] nums) {
            int len = nums.length / 2;
            int vote = 0;
            int people = 0;
            for(int i = 0; i < nums.length; i++){
                if(vote == 0){
                    people = nums[i];
                }
                if(nums[i] == people){
                    vote++;
                }else{
                    vote--;
                }
            }

            return people;
        }
    }
}
