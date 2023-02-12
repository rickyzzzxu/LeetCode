package ricky.com.SwordOffer;

public class exchange {
    class Solution {
        public int[] exchange(int[] nums) {
            if(nums.length == 0){
                return new int[0];
            }

            int sum = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] % 2 == 1){
                    sum++;
                }
            }

            int[] res = new int[nums.length];
            int x = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] % 2 == 1){
                    res[x++] = nums[i];
                }else{
                    res[sum++] = nums[i];
                }
            }

            return res;
        }
    }
}
