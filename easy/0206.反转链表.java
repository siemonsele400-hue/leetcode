/**
 * 郎新博 | 2025.11.26 Day1 第5题 收官之战！
 * 206. 反转链表
 * https://leetcode.cn/problems/reverse-linked-list/
 * 迭代三指针法 一次AC
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
