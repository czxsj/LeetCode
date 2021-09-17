package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.树的遍历.q110_平衡二叉树_easy.f2;

/**
 * 从底至顶遍历 o(n)
 */
public class Solution {

    public boolean isBalanced(TreeNode root) {
        return depth(root) != -1;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        if (left == -1) {
            return -1;
        }
        int right = depth(root.right);
        if (right == -1) {
            return -1;
        }
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
