package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/7 22:52
 */
public class constructArr {
    /*剑指 Offer 66. 构建乘积数组
    给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B[i] 的值是数组 A 中除了下标 i 以外
    的元素的积, 即 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。*/
    class Solution {
        public int[] constructArr(int[] a) {
            if (a.length == 0) {
                return new int[0];
            }

            int len = a.length;
            int[] left = new int[len];
            int[] right = new int[len];
            left[0] = 1;
            right[len - 1] = 1;
            for (int i = 1; i < len; i++) {
                left[i] = left[i - 1] * a[i - 1];
            }

            for (int j = len - 2; j >= 0; j--) {
                right[j] = right[j + 1] * a[j + 1];
            }

            for (int i = 0; i < len; i++) {
                a[i] = left[i] * right[i];
            }

            return a;
        }
    }
}
