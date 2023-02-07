package ricky.com.SwordOffer;

public class cuttingRope2 {
    /*给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
    每段绳子的长度记为 k[0],k[1]...k[m - 1] 。请问 k[0]*k[1]*...*k[m - 1] 可能
    的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时
    得到的最大乘积是18。
    答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。*/
    class Solution {
        static final int mod = 1000000007;
        public int cuttingRope2(int n) {
            if(n <= 3){
                return n - 1;
            }

            int res = n / 3;
            int md = n % 3;
            if(md == 1){
                return (int)((pow(3, res - 1) * 4) % mod);
            }else if(md == 2){
                return (int)((pow(3, res) * 2) % mod);
            }else{
                return (int)((pow(3, res)) % mod);
            }
        }

        public long pow(long x, long y){
            long res = 1;
            while(y != 0){
                if((y & 1) == 1){
                    res = (res * x) % mod;
                }
                y >>= 1;
                x = (x * x) % mod;
            }
            return res;
        }
    }
}
