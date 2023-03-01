package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/1 20:16
 */
public class reversePairs {
    /*剑指 Offer 51. 数组中的逆序对
    在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，
    求出这个数组中的逆序对的总数。*/
    class Solution {
        int res = 0;

        public int reversePairs(int[] nums) {
            if (nums.length < 2) {
                return 0;
            }

            mergeSort(nums, 0, nums.length - 1);
            return res;

        }

        private void mergeSort(int[] nums, int left, int right) {
            if (left == right) {
                return;
            }

            int mid = (right - left) / 2 + left;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, mid + 1, right);
        }

        private void merge(int[] nums, int l1, int r1, int l2, int r2) {
            int i = l1;
            int j = l2;
            int[] temp = new int[r2 - l1 + 1];
            int k = 0;
            while (i <= r1 && j <= r2) {
                if (nums[i] > nums[j]) {
                    temp[k++] = nums[j++];
                    res += (r1 - i + 1);
                } else {
                    temp[k++] = nums[i++];
                }
            }

            while (i <= r1) {
                temp[k++] = nums[i++];
            }

            while (j <= r2) {
                temp[k++] = nums[j++];
            }

            k = 0;
            for (i = l1; i <= r2; i++) {
                nums[i] = temp[k++];
            }
        }
    }
}
