package leetcode.accepted;
import leetcode.ListNode;

//https://leetcode.com/problems/merge-two-sorted-lists


//this was not my solution but this has always been my thought process which i was unable to put into code even in
//leetcode 2: add two numbers using linked lists -- i think this will help put things into perspective for future LL questions
//and therefore i saved and submitted as my own.


public class mergeTwoSortedLL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode outNode = new ListNode();
        ListNode head = new ListNode(0,outNode);

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                outNode.next = list1;
                list1 = list1.next;
            }else{
                outNode.next = list2;
                list2 = list2.next;
            }
            outNode = outNode.next;

        }


        if(list1 != null){
            outNode.next = list1;
        }else if(list2 != null){
            outNode.next = list2;
        }
        return head.next.next;
    }
}
