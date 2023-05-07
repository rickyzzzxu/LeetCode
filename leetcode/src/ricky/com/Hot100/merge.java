package ricky.com.Hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
            if (intervals == null || intervals.length == 0) {
                return new int[0][];
            }

            Arrays.sort(intervals, ((o1, o2) -> o1[0] - o2[0]));
            List<int[]> list = new ArrayList<>();
            int start = intervals[0][0];
            int end = intervals[0][1];
            for (int i = 0; i < intervals.length; i++) {
                if (intervals[i][0] > end) {
                    list.add(new int[]{start, end});
                    start = intervals[i][0];
                    end = intervals[i][1];
                } else {
                    if (intervals[i][1] <= end) {

                    } else {
                        end = intervals[i][1];
                    }
                }
            }
            //别忘了把最后一个答案也加进去
            list.add(new int[]{start, end});

            int[][] res = new int[list.size()][];
            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }
            //return list.toArray(new int[0][]);

            return res;
        }
    }
}
