package com.ricky;

public class cuttingRope {
    /*给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长
    度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子
    的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。*/
    class Solution {
        public int cuttingRope(int n) {
            if(n <= 2){
                return 1;
            }

            if(n == 3){
                return 2;
            }

            int res = n / 3;
            int mod = n % 3;
            if(mod == 0){
                return pow(3, res);
            }else if(mod == 1){
                return pow(3, res - 1) * 4;
            }else{
                return pow(3, res) * 2;
            }
        }

        private int pow(int res, int n){
            int ans = 1;
            for(int i = 0; i < n; i++){
                ans *= res;
            }
            return ans;
        }
    }
}
