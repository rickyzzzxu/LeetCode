package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/11 20:38
 */
public class rob3 {
    /*337. 打家劫舍 III
    小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为 root 。
    除了 root 之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到
    “这个地方的所有房屋的排列类似于一棵二叉树”。 如果 两个直接相连的房子在同一天晚上被打劫 ，房屋将自动报警。
    给定二叉树的 root 。返回 在不触动警报的情况下 ，小偷能够盗取的最高金额 。*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public int rob(TreeNode root) {
            if (root == null) {
                return 0;
            }

            //res[0]表示打劫root，res[1]表示不打劫root
            int[] res = postOrder(root);
            return Math.max(res[0], res[1]);
        }

        private int[] postOrder(TreeNode root) {
            if (root == null) {
                //一定是2
                return new int[2];
            }

            int[] left = postOrder(root.left);
            int[] right = postOrder(root.right);
            int[] res = new int[2];
            res[0] = root.val + left[1] + right[1];
            res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
            return res;
        }
    }
}
