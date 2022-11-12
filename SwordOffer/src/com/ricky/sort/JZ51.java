package com.ricky.sort;

public class JZ51 {
    /*数组中的逆序对
            描述
    在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,
    求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P mod 1000000007*/
    public class Solution {
        int num = 0;
        public int InversePairs(int [] array) {
            //先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
            int []temp = new int[array.length];
            sort(array, 0, array.length - 1, temp);
            return num;
        }

        private  void sort(int[] array, int left, int right, int[] temp) {
            if (left == right) {
                return;
            }

            int mid = (left + right) / 2;
            //左边归并排序，使得左子序列有序
            sort(array, left, mid, temp);
            //右边归并排序，使得右子序列有序
            sort(array, mid + 1, right, temp);
            //将两个有序子数组合并操作
            merge(array, left, mid, right, temp);
        }

        private  void merge(int[] array, int left, int mid, int right, int[] temp) {
            //指向左边的第一个位置
            int i = left;
            //指向右边的第一个位置
            int j = mid + 1;
            //指向临时数组的第一个位置
            int k = 0;
            while (i <= mid && j <= right) {
                if (array[i] > array[j]) {
                    temp[k++] = array[j++];
                    num = (num + mid - i + 1) % 1000000007;
                } else {
                    temp[k++] = array[i++];
                }
            }

            //将左边剩余元素填充进temp中
            while (i <= mid) {
                temp[k++] = array[i++];
            }
            //将右序列剩余元素填充进temp中
            while (j <= right) {
                temp[k++] = array[j++];
            }

            k = 0;
            //将temp中的元素全部拷贝到原数组中
            while (left <= right) {
                array[left++] = temp[k++];
            }
        }

    }

}
