package leetcode.accepted;
import leetcode.ListNode;
import java.util.Stack;
//https://leetcode.com/problems/reverse-linked-list/

public class reverseLinkedListVersion1 {
    /*this was originally NOT my thought process but since failing to convert my original thought processes
      (cited in version 2) into java lol so i was advised to use stack. even this i couldnt complete on my own
      and i took help from a TA
     */

    public ListNode reverseList(ListNode head) {
        Stack<Integer> reverser = new Stack();
        ListNode outNode = new ListNode();

        while(head != null){
            reverser.push(head.val);
            head = head.next;
        }

        if(reverser.empty()) return null;

        outNode.val = reverser.pop();
        ListNode cursor = outNode;

        while(!reverser.empty()){
            outNode.next = new ListNode(reverser.pop());
            outNode = outNode.next;
        }
        return cursor;

    }
}
