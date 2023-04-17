package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/1 16:00
 */
public class numTrees {
    /*96. 不同的二叉搜索树
    给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？
    返回满足题意的二叉搜索树的种数。*/
    class Solution {
        public int numTrees(int n) {
            //dp[i]表示整数i能构成互不相同的二叉搜索树有多少种
            //dp[j] * dp[i - j - 1],表示左子树*右子树
            int[] dp = new int[n + 1];
            dp[0] = 1;
            for (int i = 1; i <= n; i++) {
                //递推公式dp[n] = dp[0]*dp[n-1] + dp[1]*dp[n-2] + ... + dp[n-1]*dp[0];
                for (int j = 0; j < i; j++) {
                    // dp[j] 表示左子树能够构成的二叉搜索树的个数
                    // dp[i - 1 - j] 表示右子树能够构成的二叉搜索树的个数
                    // 二者相乘即为以 j 为根节点，左子树有 dp[j] 种情况，右子树有 dp[i - 1 - j] 种情况的所有情况之和
                    dp[i] += dp[j] * dp[i - j - 1];
                }
            }

            return dp[n];
        }
    }
}
