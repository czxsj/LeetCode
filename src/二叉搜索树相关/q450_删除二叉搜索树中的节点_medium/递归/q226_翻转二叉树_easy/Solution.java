package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.递归.q226_翻转二叉树_easy;

/**
 * 递归 o(n)
 */
public class Solution {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null) {
            invertTree(root.left);
        }
        if (root.right != null) {
            invertTree(root.right);
        }
        return root;
    }
}
