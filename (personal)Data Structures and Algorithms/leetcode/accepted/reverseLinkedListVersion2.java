package leetcode.accepted;

import leetcode.ListNode;

import java.util.Stack;
//https://leetcode.com/problems/reverse-linked-list/

public class reverseLinkedListVersion2 {
    /*
      this was my original thought process but since failing to convert thought processes
      into java lol so this is from leetcode discussion
     */

    public ListNode reverseList(ListNode head) {
        /* iterative solution */
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    /* recursive solution
    public ListNode reverseList(ListNode head) {

        return reverseListInt(head, null);
    }

    private ListNode reverseListInt(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
        }
    */
}
