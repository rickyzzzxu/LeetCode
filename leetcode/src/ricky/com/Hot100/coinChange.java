package ricky.com.Hot100;

import java.util.Arrays;

/**
 * @Author xdg
 * @Date 2023/4/11 17:08
 */
public class coinChange {
    /*322. 零钱兑换
    给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
    计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。
    你可以认为每种硬币的数量是无限的。*/

    class Solution {
        public int coinChange(int[] coins, int amount) {
            if (coins == null || coins.length == 0 || amount == 0) {
                return 0;
            }

            int[] dp = new int[amount + 1];
            dp[0] = 0;
            for (int i = 1; i <= amount; i++) {
                /*将dp[i]初始化为Integer.MAX_VALUE的目的是为了确保在计算最小硬币数量时，
                 当没有有效的硬币组合可以达到目标金额i时，将其标记为不可达。*/
                dp[i] = Integer.MAX_VALUE;
                for (int j = 0; j < coins.length; j++) {
                    /*dp[i - coins[j]] != Integer.MAX_VALUE 检查使用当前硬币面值coins[j]
                是否可以达到金额i - coins[j]。如果dp[i - coins[j]]的值等于Integer.MAX_VALUE，
                    表示金额i - coins[j]无法通过现有的硬币组合达到，因此使用当前硬币面值coins[j]
                也无法达到金额i。*/
                    if (i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                    }
                }
            }

            return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
        }
    }
}
