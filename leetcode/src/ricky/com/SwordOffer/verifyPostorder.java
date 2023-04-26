package ricky.com.SwordOffer;

public class verifyPostorder {
    /*剑指 Offer 33. 二叉搜索树的后序遍历序列
    输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。
    假设输入的数组的任意两个数字都互不相同。*/
    class Solution {
        public boolean verifyPostorder(int[] postorder) {
            if (postorder == null || postorder.length == 0) {
                return true;
            }

            return check(postorder, 0, postorder.length - 1);
        }

        private boolean check(int[] postOrder, int l, int r) {
            if (l > r) {
                return true;
            }

            int root = postOrder[r];
            int index = l;
            while (root > postOrder[index]) {
                index++;
            }

            for (int i = index; i < r; i++) {
                if (root > postOrder[i]) {
                    return false;
                }
            }

            //左右子树都要递归检查一遍
            return check(postOrder, l, index - 1) && check(postOrder, index, r - 1);
        }
    }
}
