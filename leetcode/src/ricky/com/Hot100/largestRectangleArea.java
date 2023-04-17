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
            if (heights == null || heights.length == 0) {
                return 0;
            }

            int n = heights.length;
            //左边第一个高度小于第i个矩阵的矩阵
            int[] leftMin = new int[n];
            int[] rightMin = new int[n];
            leftMin[0] = -1;
            rightMin[n - 1] = n;
            int res = 0;
            for (int i = 1; i < n; i++) {
                //第i个前面的一个
                int pre = i - 1;
                //>=i就接着往前找
                while (pre >= 0 && heights[pre] >= heights[i]) {
                    //heights[pre] >= heights[i]，说明
                    pre = leftMin[pre];
                }
                leftMin[i] = pre;
            }

            for (int i = n - 2; i >= 0; i--) {
                int after = i + 1;
                while (after < n && heights[after] >= heights[i]) {
                    after = rightMin[after];
                }
                rightMin[i] = after;
            }

            for (int i = 0; i < n; i++) {
                res = Math.max(res, heights[i] * (rightMin[i] - leftMin[i] - 1));
            }

            return res;
        }
    }
}
