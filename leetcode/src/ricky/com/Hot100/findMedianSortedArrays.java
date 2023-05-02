package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/12 20:29
 */
public class findMedianSortedArrays {
    /*4. 寻找两个正序数组的中位数
    给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
    算法的时间复杂度应该为 O(log (m+n)) 。*/
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int len = nums1.length + nums2.length;
            if (len % 2 == 1) {
                return findK(nums1, 0, nums2, 0, (len + 1) / 2);
            } else {
                double res = (findK(nums1, 0, nums2, 0, len / 2) + findK(nums1, 0, nums2, 0, (len + 2) / 2)) / 2.0;
                return res;
            }
        }

        private double findK(int[] num1, int start1, int[] num2, int start2, int k) {
            //当num1为空时，返回num2的第k个元素
            if (start1 >= num1.length) {
                return num2[start2 + k - 1];
            }
            //当num2为空时，返回num1的第k个元素
            if (start2 >= num2.length) {
                return num1[start1 + k - 1];
            }

            //返回第一个数时，找到时的退出条件
            if (k == 1) {
                return Math.min(num1[start1], num2[start2]);
            }

            //看num1和num2哪个剩余的部分是不是比 k/2要少
            int halfK1 = Integer.MAX_VALUE;
            int halfK2 = Integer.MAX_VALUE;
            if (num1.length - start1 >= k / 2) {
                halfK1 = num1[start1 + k / 2 - 1];
            }

            if (num2.length - start2 >= k / 2) {
                halfK2 = num2[start2 + k / 2 - 1];
            }

            if (halfK1 < halfK2) {
                return findK(num1, start1 + k / 2, num2, start2, k - k / 2);
            } else {
                return findK(num1, start1, num2, start2 + k / 2, k - k / 2);
            }
        }
    }
}
