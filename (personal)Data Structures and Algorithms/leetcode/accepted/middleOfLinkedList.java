package leetcode.accepted;

import leetcode.ListNode;
//https://leetcode.com/problems/middle-of-the-linked-list/submissions/


//my solution was to traverse the entire list to get number of elements in the list then divide that number
//also created a ListNode mid = head; which stored the next value of head as well -- used that to traverse the list again
// until the middle number element and returned the element;

//https://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-linked-list/
/*this was geeksforgeeks's solution
        " Traverse linked list using two-pointers. Move one pointer by one and the other pointers by two.
         When the fast pointer reaches the end, the slow pointer will reach the middle of the linked list."
* */
/*
* this method is also called slow pointer fast pointer approach
*
* two pointers are initialized, one pointer's goal is to reach the end of the list and the loop iterates it so
* the other pointer arrives at the middle when the first arrives at the end and we return the second pointer.
* */


//another method
//Initialize the mid element as head and initialize a counter as 0. Traverse the list from the head,
// while traversing increment the counter and change mid to mid->next whenever the counter is odd.
// So the mid will move only half of the total length of the list.

public class middleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode mid = head;
        ListNode temp = head;

        while(temp!=null && temp.next!=null){
            temp = temp.next.next;
            mid = mid.next;
        }
        return mid;
    }

}
