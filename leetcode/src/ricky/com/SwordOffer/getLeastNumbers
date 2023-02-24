package ricky.com.SwordOffer;

import java.util.PriorityQueue;

public class getLeastNumbers {
    /*剑指 Offer 40. 最小的k个数
    输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4
    个数字是1、2、3、4。*/
    class Solution {
        public int[] getLeastNumbers(int[] arr, int k) {
            if (arr.length == 0 || k == 0) {
                return new int[0];
            }

            int[] res = new int[k];
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for (int i = 0; i < arr.length; i++) {
                queue.add(arr[i]);
            }

            for (int i = 0; i < k; i++) {
                res[i] = queue.poll();
            }

            return res;
        }
    }
}
