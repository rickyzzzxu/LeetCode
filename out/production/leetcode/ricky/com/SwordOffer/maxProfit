package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/7 16:24
 */
public class maxProfit {
    /*剑指 Offer 63. 股票的最大利润
    假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？*/
    class Solution {
        public int maxProfit(int[] prices) {
            //dp[i]表示第i天的利润
            if (prices.length == 0) {
                return 0;
            }

            int[] dp = new int[prices.length];
            dp[0] = 0;
            int res = 0;
            int buy = prices[0];
            for (int i = 1; i < prices.length; i++) {
                if (buy > prices[i]) {
                    buy = prices[i];
                }

                dp[i] = prices[i] - buy;
            }

            for (int i = 1; i < prices.length; i++) {
                if (res < dp[i]) {
                    res = dp[i];
                }
            }
            return res;
        }
    }

}
