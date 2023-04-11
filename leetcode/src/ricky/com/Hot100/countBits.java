package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/11 17:23
 */
public class countBits {
    /*338. 比特位计数
    给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，计算其二进制表示中 1 的个数 ，返回一
    个长度为 n + 1 的数组 ans 作为答案。*/
    class Solution {
        public int[] countBits(int n) {
            int[] res = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                res[i] = countBit(i);
            }

            return res;
        }

        private int countBit(int n) {
            int res = 0;
            while (n != 0) {
                if ((n & 1) == 1) {
                    res++;
                }
                n >>= 1;
            }

            return res;
        }
    }
}
