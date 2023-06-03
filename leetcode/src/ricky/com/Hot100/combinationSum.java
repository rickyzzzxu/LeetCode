package ricky.com.Hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author xdg
 * @Date 2023/3/24 12:25
 */
public class combinationSum {
    /*39. 组合总和
    给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，找出 candidates 中可以使数字和为
    目标数 target 的 所有 不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。
    candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。
    对于给定的输入，保证和为 target 的不同组合数少于 150 个。*/
    class Solution {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            if (candidates == null || candidates.length == 0) {
                return res;
            }

            Arrays.sort(candidates);
            dfs(candidates, target, 0);
            return res;
        }

        private void dfs(int[] candidates, int target, int k) {
            //一定要有剪枝
            if (target < 0) {
                return;
            }

            if (target == 0) {
                res.add(new ArrayList<>(list));
                return;
            }

            for (int i = k; i < candidates.length; i++) {
                list.add(candidates[i]);
                dfs(candidates, target - candidates[i], i);
                list.remove(list.size() - 1);
            }
        }
    }
}
