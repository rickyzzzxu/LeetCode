package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/25 15:44
 */
public class trap {
    /*42. 接雨水
    给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。*/
    class Solution {
        public int trap(int[] height) {
            if (height == null || height.length == 0) {
                return 0;
            }

            int res = 0;
            //记录左边最大的高度
            int lMax = 0;
            //记录右边最大的高度
            int rMax = 0;
            int l = 0;
            int r = height.length - 1;
            while (l < r) {
                lMax = Math.max(lMax, height[l]);
                rMax = Math.max(rMax, height[r]);
                if (lMax < rMax) {
                    //左边最大高度减去自身高度
                    res += lMax - height[l];
                    l++;
                } else {
                    //右边最大高度减去自身高度
                    res += rMax - height[r];
                    r--;
                }
            }

            return res;
        }
    }
}
