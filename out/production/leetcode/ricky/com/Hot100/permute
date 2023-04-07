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

        public List<List<Integer>> permute(int[] nums) {
            dfs(nums);
            return res;
        }

        private void dfs(int[] nums) {
            if (nums.length == list.size()) {
                res.add(new ArrayList<>(list));
                return;
            }

            for (int i = 0; i < nums.length; i++) {
                if (list.contains(nums[i])) {
                    continue;
                }

                list.add(nums[i]);
                dfs(nums);
                list.remove(list.size() - 1);
            }
        }
    }
}
