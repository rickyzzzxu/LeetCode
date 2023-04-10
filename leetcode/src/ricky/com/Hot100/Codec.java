package ricky.com.Hot100;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author xdg
 * @Date 2023/4/10 16:36
 */
public class Codec {
    /*297. 二叉树的序列化与反序列化
    序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，
    同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
    请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一
    个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
    提示: 输入输出格式与 LeetCode 目前使用的方式一致，详情请参阅 LeetCode 序列化二叉树的格式。你并非必
    须采取这种方式，你也可以采用其他的方法解决这个问题。*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Codec1 {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) {
                return "";
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            StringBuilder sb = new StringBuilder();
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode temp = queue.poll();
                    if (temp == null) {
                        sb.append("null,");
                    } else {
                        queue.add(temp.left);
                        queue.add(temp.right);
                        sb.append(temp.val + ",");
                    }
                }
            }

            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == null || data.length() == 0) {
                return null;
            }

            String[] str = data.split(",");
            TreeNode root = new TreeNode(Integer.parseInt(str[0]));
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int index = 1;
            while (!queue.isEmpty()) {
                TreeNode temp = queue.poll();
                if (!str[index].equals("null")) {
                    temp.left = new TreeNode(Integer.parseInt(str[index]));
                    queue.add(temp.left);
                }
                index++;

                if (!str[index].equals("null")) {
                    temp.right = new TreeNode(Integer.parseInt(str[index]));
                    queue.add(temp.right);
                }
                index++;
            }

            return root;
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
}
