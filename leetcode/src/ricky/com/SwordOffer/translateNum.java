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
            String str = num + "";
            // 考虑到有dp[i - 2]，所以要设置成str.length() + 1;
            // dp[i]表示以i结尾的组合数为多少
            int[] dp = new int[str.length() + 1];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= str.length(); i++) {
                int pre = Integer.parseInt(str.charAt(i - 2) + "");
                int cur = pre * 10 + Integer.parseInt(str.charAt(i - 1) + "");
                if (cur >= 10 && cur <= 25) {
                    //dp[i]为前面组合和不组合的情况相加
                    dp[i] = dp[i - 2] + dp[i - 1];
                } else {
                    dp[i] = dp[i - 1];
                }
            }

            return dp[str.length()];
        }
    }
}
