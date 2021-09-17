package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.快慢指针遍历.q141_环形链表_easy.f2;

/**
 * 快慢指针 o(n)
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
