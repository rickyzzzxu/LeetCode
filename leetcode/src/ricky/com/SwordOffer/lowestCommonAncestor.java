package ricky.com.SwordOffer;

/**
 * @Author xdg
 * @Date 2023/3/8 15:09
 */
public class lowestCommonAncestor {
    /*剑指 Offer 68 - I. 二叉搜索树的最近公共祖先
    给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
    百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x
    是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            while (root != null) {
                if (p.val > root.val && q.val > root.val) {
                    root = root.right;
                } else if (p.val < root.val && q.val < root.val) {
                    root = root.left;
                } else {
                    return root;
                }
            }

            return null;

        }
    }
}
