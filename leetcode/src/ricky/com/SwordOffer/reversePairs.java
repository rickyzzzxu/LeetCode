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
            if (nums == null || nums.length == 0) {
                return 0;
            }

            mergeSort(nums, 0, nums.length - 1);
            return res;
        }

        private void mergeSort(int[] nums, int l, int r) {
            if (l >= r) {
                return;
            }

            int mid = (r - l) / 2 + l;
            //mid是前半段的
            mergeSort(nums, l, mid);
            //mid+1是后半段的开始位置
            mergeSort(nums, mid + 1, r);
            merge(nums, l, mid, r);
        }

        private void merge(int[] nums, int l, int mid, int r) {
            int i = l;
            //初值为mid+1
            int j = mid + 1;
            int[] temp = new int[r - l + 1];
            int index = 0;
            while (i <= mid && j <= r) {
                //=必须在这里
                if (nums[i] <= nums[j]) {
                    temp[index++] = nums[i++];
                } else {
                    //只有nums[i] > nums[j]才能计算res
                    res += mid - i + 1;
                    temp[index++] = nums[j++];
                }
            }

            while (i <= mid) {
                temp[index++] = nums[i++];
            }

            while (j <= r) {
                temp[index++] = nums[j++];
            }

            index = 0;
            for (i = l; i <= r; i++) {
                nums[i] = temp[index++];
            }

        }
    }
}
