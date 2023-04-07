package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/7 16:32
 */
public class SwordOffer {
    /*剑指 Offer 64. 求1+2+…+n
    求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。*/
    class Solution {
        int res = 0;

        public int sumNums(int n) {
            boolean flag = n > 1 && sumNums(n - 1) > 0;
            res += n;
            return res;
        }
    }
}
