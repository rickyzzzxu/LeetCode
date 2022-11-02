package com.ricky.dp;

public class JZ63 {
    /*买卖股票的最好时机(一)
    描述
    假设你有一个数组prices，长度为n，其中prices[i]是股票在第i天的价格，请根据这个价格数组，
    返回买卖股票能获得的最大收益
    1.你可以买入一次股票和卖出一次股票，并非每天都可以买入或卖出一次，总共只能买入和卖出一次，且买
      入必须在卖出的前面的某一天
    2.如果不能获取到任何利润，请返回0
    3.假设买入卖出均无手续费*/


    public class Solution {
        /**
         *
         * @param prices int整型一维数组
         * @return int整型
         */
        public int maxProfit (int[] prices) {
            // write code here
            if (prices.length == 0) {
                return 0;
            }

            //int buy = Integer.MAX_VALUE;
            int buy = prices[0];
            int max = 0;
            for (int i = 0; i < prices.length; i++) {
                //如果prices[i]比要买的小，就更新buy，取小的值
                if (prices[i] < buy) {
                    buy = prices[i];
                }

                //prices[i]减去卖的，比原来的收入要大，就卖出去，更新max。
                if (prices[i] - buy > max) {
                    max = prices[i] - buy;
                }
            }
            return max;
        }
    }
}
