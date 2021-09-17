package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.快慢指针遍历.q876_链表的中间结点_easy;

/**
 * 快慢指针法 o(n)
 */
public class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
