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
            int l = 0;
            int r = height.length - 1;
            int lMax = 0;
            int rMax = 0;
            int res = 0;
            while (l < r) {
                lMax = Math.max(lMax, height[l]);
                rMax = Math.max(rMax, height[r]);
                if (lMax < rMax) {
                    res += lMax - height[l];
                    l++;
                } else {
                    res += rMax - height[r];
                    r--;
                }
            }

            return res;
        }
    }
}
