package ricky.com.Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xdg
 * @Date 2023/3/25 16:11
 */
public class permute {
    /*46. 全排列
    给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。*/
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] visited;

        public List<List<Integer>> permute(int[] nums) {
            if (nums == null || nums.length == 0) {
                return res;
            }

            visited = new boolean[nums.length];
            dfs(nums, 0);
            return res;
        }

        private void dfs(int[] nums, int k) {
            //退出条件一定要注意
            if (nums.length == list.size()) {
                res.add(new ArrayList<>(list));
                return;
            }

            for (int i = 0; i < nums.length; i++) {
                //也可以用这个，空间复杂度会降低
                /*if (list.contains(nums[i])) {
                    continue;
                }*/
                if (!visited[i]) {
                    visited[i] = true;
                    list.add(nums[i]);
                    dfs(nums, i + 1);
                    list.remove(list.size() - 1);
                    visited[i] = false;
                }
            }
        }
    }
}
