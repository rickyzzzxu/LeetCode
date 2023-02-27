package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/2/27 20:09
 */
public class translateNum {
    /*剑指 Offer 46. 把数字翻译成字符串
    给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译
    成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有
    多少种不同的翻译方法。*/
    class Solution {
        public int translateNum(int num) {
            char[] arr = String.valueOf(num).toCharArray();
            int[] dp = new int[arr.length + 1];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= arr.length; i++) {
                int temp = 10 * (arr[i - 2] - '0') + arr[i - 1] - '0';
                if (temp > 9 && temp < 26) {
                    dp[i] = dp[i - 2] + dp[i - 1];
                } else {
                    dp[i] = dp[i - 1];
                }
            }

            return dp[arr.length];
        }
    }
}
