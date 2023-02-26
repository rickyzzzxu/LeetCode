package ricky.com.SwordOffer;

public class findNthDigit {
    /*剑指 Offer 44. 数字序列中某一位的数字
    数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）
    是5，第13位是1，第19位是4，等等。请写一个函数，求任意第n位对应的数字。*/
    class Solution {
        public int findNthDigit(int n) {
            if (n == 0) {
                return 0;
            }

            int bit = 1;
            long sum = 9;
            long start = 1;
            while (n > sum) {
                n -= sum;
                bit++;
                start *= 10;
                sum = start * 9 * bit;
            }

            String res = start + (n - 1) / bit + "";
            int index = (n - 1) % bit;
            return Integer.parseInt(res.charAt(index) + "");
        }
    }
}
