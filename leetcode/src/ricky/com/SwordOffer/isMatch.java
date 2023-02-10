package ricky.com.SwordOffer;

public class isMatch {
    /*请实现一个函数用来匹配包含'. '和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表
    示它前面的字符可以出现任意次（含0次）。在本题中，匹配是指字符串的所有字符匹配整个模式。例如，
    字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但与"aa.a"和"ab*a"均不匹配。*/
    class Solution {
        public boolean isMatch(String s, String p) {
            if(s.length() == 0 && p.length() == 0){
                return true;
            }

            int n = s.length();
            int m = p.length();
            boolean[][] dp = new boolean[n + 1][m + 1];
            dp[0][0] = true;
            for(int i = 2; i < m + 1; i++){
                if(p.charAt(i - 1) == '*'){
                    dp[0][i] = dp[0][i - 2];
                }
            }

            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    if(p.charAt(j - 1) != '*'){
                        if(p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)){
                            dp[i][j] = dp[i - 1][j - 1];
                        }
                    }else{
                        if(p.charAt(j - 2) != s.charAt(i - 1) && p.charAt(j - 2) != '.'){
                            dp[i][j] = dp[i][j - 2];
                        }else{
                            dp[i][j] = dp[i][j - 2] || dp[i][j - 1] || dp[i - 1][j];
                        }
                    }
                }
            }

            return dp[n][m];
        }
    }
}
