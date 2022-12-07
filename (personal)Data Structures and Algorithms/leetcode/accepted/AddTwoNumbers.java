package leetcode.accepted;

//https://leetcode.com/problems/add-two-numbers/

import leetcode.ListNode;

/*
* add two numbers represented by reversed linkedlists
* */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int X = 0, Cin = 0;
        ListNode out = new ListNode(0);
        ListNode cursor = out;

        while(l1 != null || l2 != null || Cin !=0){
            X=Cin;
            if(l1!=null){
                X += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                X+= l2.val;
                l2 = l2.next;
            }


            Cin = X/10;
            X = X%10;

            cursor.next = new ListNode(X);
            cursor = cursor.next;
        }



        return out.next;
    }

}
