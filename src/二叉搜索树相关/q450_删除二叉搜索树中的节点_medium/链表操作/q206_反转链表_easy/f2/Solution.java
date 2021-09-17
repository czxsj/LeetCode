package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.链表操作.q206_反转链表_easy.f2;

/**
 * 递归法 o(n)
 */
class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
