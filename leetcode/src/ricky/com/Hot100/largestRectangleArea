package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/31 17:54
 */
public class largestRectangleArea {
    /*84. 柱状图中最大的矩形
    给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
    求在该柱状图中，能够勾勒出来的矩形的最大面积。*/
    class Solution {
        public int largestRectangleArea(int[] heights) {
            int[] leftMin = new int[heights.length];
            int[] rigthMin = new int[heights.length];
            leftMin[0] = -1;
            rigthMin[heights.length - 1] = heights.length;
            int res = 0;
            for (int i = 1; i < heights.length; i++) {
                int temp = i - 1;
                while (temp >= 0 && heights[temp] >= heights[i]) {
                    temp = leftMin[temp];
                }
                leftMin[i] = temp;
            }

            for (int i = heights.length - 2; i >= 0; i--) {
                int temp = i + 1;
                while (temp < heights.length && heights[temp] >= heights[i]) {
                    temp = rigthMin[temp];
                }
                rigthMin[i] = temp;
            }

            for (int i = 0; i < heights.length; i++) {
                res = Math.max(res, heights[i] * (rigthMin[i] - leftMin[i] - 1));
            }

            return res;
        }
    }
}
