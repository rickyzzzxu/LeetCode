package ricky.com.SwordOffer;

public class isSubStructure {
    /*输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
    B是A的子结构， 即 A中有出现和B相同的结构和节点值。*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public boolean isSubStructure(TreeNode A, TreeNode B) {
            if (B == null) {
                return false;
            }
            if (A == null) {
                return false;
            }

            if (check(A, B)) {
                return true;
            } else {
                return isSubStructure(A.left, B) || isSubStructure(A.right, B);
            }
        }

        private boolean check(TreeNode A, TreeNode B) {
            if (A == null && B == null) {
                return true;
            }

            if (A == null && B != null) {
                return false;
            }

            if (A != null && B == null) {
                return true;
            }

            if (A.val != B.val) {
                return false;
            } else {
                return check(A.left, B.left) && check(A.right, B.right);
            }
        }
    }
}
