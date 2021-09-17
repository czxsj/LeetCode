package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.链表操作.q206_反转链表_easy.f1;

/**
 * 遍历直接反向修改next指针 o(n)
 */
class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode pre  = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode t = temp.next;
            temp.next = pre;
            pre = temp;
            temp = t;
        }
        return pre;
    }
}
