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
                return (findK(nums1, 0, nums2, 0, len / 2) + findK(nums1, 0, nums2, 0, (len + 2) / 2)) / 2;
            }
        }

        private double findK(int[] nums1, int start1, int[] nums2, int start2, int k) {
            if (nums1.length <= start1) {
                return nums2[start2 + k - 1];
            }

            if (nums2.length <= start2) {
                return nums1[start1 + k - 1];
            }

            if (k == 1) {
                return Math.min(nums1[start1], nums2[start2]);
            }

            int mid1 = Integer.MAX_VALUE;
            int mid2 = Integer.MAX_VALUE;
            if (nums1.length - start1 + 1 > k / 2) {
                mid1 = nums1[start1 + k / 2 - 1];
            }

            if (nums2.length - start2 + 1 > k / 2) {
                mid2 = nums2[start2 + k / 2 - 1];
            }

            if (mid1 < mid2) {
                return findK(nums1, start1 + k / 2, nums2, start2, k - k / 2);
            } else {
                return findK(nums1, start1, nums2, start2 + k / 2, k - k / 2);
            }
        }
    }
}
