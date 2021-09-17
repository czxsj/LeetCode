package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.递归.q104_二叉树的最大深度_easy;

/**
 * 递归 o(n)
 */
public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
