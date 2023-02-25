package ricky.com.SwordOffer;

public class countDigitOne {
    /*输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
    例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。*/
    class Solution {
        public int countDigitOne(int n) {
            long bit = 1;
            long cur = n / bit % 10;
            long low = n % bit;
            long high = n / bit / 10;
            long res = 0;
            while (bit <= n) {
                if (cur > 1) {
                    res += (high + 1) * bit;
                } else if (cur == 1) {
                    res += high * bit + low + 1;
                } else {
                    res += high * bit;
                }

                bit *= 10;
                cur = n / bit % 10;
                low = n % bit;
                high = n / bit / 10;
            }

            return (int) res;
        }
    }
}
