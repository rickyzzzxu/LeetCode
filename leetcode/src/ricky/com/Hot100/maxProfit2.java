package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/11 16:18
 */
public class maxProfit2 {
    /*309. 最佳买卖股票时机含冷冻期
    给定一个整数数组prices，其中第  prices[i] 表示第 i 天的股票价格 。
    设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
    卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
    注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。*/
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length == 1) {
                return 0;
            }

            //dp[i][0]:第i天持股
            //dp[i][1]:第i天不持股，处于冷冻期
            //dp[i][2]:第i天不持股，不处于冷冻期
            int[][] dp = new int[prices.length][3];
            dp[0][0] = -prices[0];
            dp[0][1] = 0;
            dp[0][2] = 0;
            for (int i = 1; i < prices.length; i++) {
                //要么是前一天不持股，今天不操作，或是前一天不持股且不是冷冻期，第i天买入
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] - prices[i]);
                //前一天持股后卖出了，第i天为冷冻期
                dp[i][1] = dp[i - 1][0] + prices[i];
                //前一天不持股，处于冷冻期，前一天不持股，不处于冷冻期，第i天不操作
                dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][2]);
            }

            return Math.max(dp[prices.length - 1][1], dp[prices.length - 1][2]);
        }
    }
}
