package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.树的遍历.q145_二叉树的后序遍历_easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 非递归法 o(n)
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> rs = new LinkedList<>();
        if (root == null) {
            return rs;
        }
        stack.push(root);

        while (!stack.empty()) {
            TreeNode temp = stack.pop();
            rs.addFirst(temp.val);
            if (temp.left != null) {
                stack.push(temp.left);
            }
            if (temp.right != null) {
                stack.push(temp.right);
            }
        }
        return rs;
    }
}
