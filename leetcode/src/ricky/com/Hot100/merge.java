package ricky.com.Hot100;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author xdg
 * @Date 2023/3/28 18:01
 */
public class merge {
    /*56. 合并区间
    以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
    请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。*/
    class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length == 1) {
                return intervals;
            }

            Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
            int start = intervals[0][0];
            int end = intervals[0][1];
            ArrayList<int[]> list = new ArrayList<>();
            for (int i = 1; i < intervals.length; i++) {
                if (end < intervals[i][0]) {
                    list.add(new int[]{start, end});
                    start = intervals[i][0];
                    end = intervals[i][1];
                } else {
                    end = Math.max(end, intervals[i][1]);
                }
            }
            //别忘了把最后一个答案也加进去
            list.add(new int[]{start, end});

            return list.toArray(new int[0][]);
        }
    }
}
