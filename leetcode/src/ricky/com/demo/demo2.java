package ricky.com.demo;

/**
 * @Author xdg
 * @Date 2023/2/28 20:01
 */
public class demo2 {

    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        return dp[n];
    }
}