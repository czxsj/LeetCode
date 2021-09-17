package 二叉搜索树相关.q450_删除二叉搜索树中的节点_medium.链表操作.q138_复制带随机指针的链表_medium.f1;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
