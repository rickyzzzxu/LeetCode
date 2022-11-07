package com.ricky.dp;

public class JZ19 {
    /*正则表达式匹配
    描述
    请实现一个函数用来匹配包括'.'和'*'的正则表达式。
            1.模式中的字符'.'表示任意一个字符
            2.模式中的字符'*'表示它前面的字符可以出现任意次（包含0次）。
    在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是
    与"aa.a"和"ab*a"均不匹配*/

    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param str string字符串
         * @param pattern string字符串
         * @return bool布尔型
         */
        public boolean match (String str, String pattern) {
            // write code here
            int n = str.length();
            int m = pattern.length();
            boolean[][] dp = new boolean[n + 1][m + 1];
            dp[0][0] = true;
            for (int j = 2; j <= m; j++) {
                if (pattern.charAt(j - 1) == '*') {
                    dp[0][j] = dp[0][j - 2];
                }
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (pattern.charAt(j - 1) != '*') {
                        if (pattern.charAt(j - 1) == str.charAt(i - 1) ||
                                pattern.charAt(j - 1) == '.') {
                            dp[i][j] = dp[i - 1][j - 1];
                        }
                    } else {
                        if (pattern.charAt(j - 2) != str.charAt(i - 1) &&
                                pattern.charAt(j - 2) != '.') {
                            dp[i][j] = dp[i][j - 2];
                        } else {
                            dp[i][j] = dp[i][j - 2] || dp[i][j - 1] || dp[i - 1][j];
                        }
                    }
                }
            }

            return dp[n][m];
        }
    }
}
