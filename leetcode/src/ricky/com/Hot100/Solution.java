package ricky.com.Hot100;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    /*207. 课程表
    你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1 。
    在选修某些课程之前需要一些先修课程。 先修课程按数组 prerequisites 给出，其中 prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则 必须 先学习课程  bi 。
    例如，先修课程对 [0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。
    请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。*/
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0 || prerequisites.length == 0) {
            return true;
        }

        int m = prerequisites.length;
        //统计所有课程的入度，课程从0~numCourses-1
        int[] inDegree = new int[numCourses];
        //prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则 必须 先学习课程  bi，ai(入度) <- bi
        //统计prerequisites[i][0]的入度ai <- bi
        for (int i = 0; i < prerequisites.length; i++) {
            inDegree[prerequisites[i][0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            //已经把一个入度为0的课程弹出，课程数减一
            numCourses--;
            for (int i = 0; i < prerequisites.length; i++) {
                //入度为0的被删了，以入度为0的为先修课的入度要减一
                if (prerequisites[i][1] == cur) {
                    inDegree[prerequisites[i][0]]--;
                    if (inDegree[prerequisites[i][0]] == 0) {
                        queue.add(prerequisites[i][0]);
                    }
                }
            }
        }

        return numCourses == 0;
    }
}