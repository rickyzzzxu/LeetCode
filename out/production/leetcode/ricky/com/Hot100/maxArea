package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/16 17:40
 */
public class maxArea {
    /*11. 盛最多水的容器
    给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
    找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
    返回容器可以储存的最大水量。
    说明：你不能倾斜容器。*/
    class Solution {
        public int maxArea(int[] height) {
            int i = 0;
            int j = height.length - 1;
            int res = 0;
            while (i < j) {
                if (height[i] < height[j]) {
                    res = Math.max(res, (j - i) * height[i]);
                    i++;
                } else {
                    res = Math.max(res, (j - i) * height[j]);
                    j--;
                }
            }

            return res;
        }
    }
}
