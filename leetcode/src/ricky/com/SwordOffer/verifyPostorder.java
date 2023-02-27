package ricky.com.SwordOffer;

public class verifyPostorder {
    /*剑指 Offer 33. 二叉搜索树的后序遍历序列
    输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。
    假设输入的数组的任意两个数字都互不相同。*/
    class Solution {
        public boolean verifyPostorder(int[] postorder) {
            if (postorder.length == 0) {
                return true;
            }

            return check(postorder, 0, postorder.length - 1);
        }

        public boolean check(int[] postorder, int l, int r) {
            if (l > r) {
                return true;
            }

            int root = postorder[r];
            int k = 0;
            while (root > postorder[k]) {
                k++;
            }

            for (int i = k; i < r; i++) {
                if (root > postorder[i]) {
                    return false;
                }
            }

            return check(postorder, l, k - 1) && check(postorder, k, r - 1);
        }
    }
}
