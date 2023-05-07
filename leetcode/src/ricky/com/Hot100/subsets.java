package ricky.com.Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xdg
 * @Date 2023/3/31 11:53
 */
public class subsets {
    /*78. 子集
    给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
    解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。*/
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> subsets(int[] nums) {
            res.add(new ArrayList<>());
            dfs(nums, 0);
            return res;
        }

        private void dfs(int[] nums, int k) {
            if (k >= nums.length) {
                return;
            }

            //先把1开头的算完，再算2开头的
            for (int i = k; i < nums.length; i++) {
                list.add(nums[i]);
                res.add(new ArrayList<>(list));
                dfs(nums, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
