package ricky.com.demo;

/**
 * @Author xdg
 * @Date 2023/2/27 19:49
 */
public class demo1 {
    public static void main(String[] args) {
        demo1 demo1 = new demo1();
        System.out.println(demo1.translateNum(12345));
    }

    public int translateNum(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        int[] dp = new int[chars.length + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= chars.length; i++) {
            int temp = 10 * (chars[i - 2] - '0') + chars[i - 1] - '0';
            if (temp >= 10 && temp < 26) {
                dp[i] = dp[i - 2] + dp[i - 1];
            } else {
                dp[i] = dp[i - 1];
            }
        }

        return dp[chars.length];
    }
}
