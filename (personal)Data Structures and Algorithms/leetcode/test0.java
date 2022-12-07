package leetcode;

import java.io.*;
import java.util.*;

public class test0 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        ListNode cursor = new ListNode();

        cursor = addTwoNumbers(l1,l2);

        while (cursor != null){
            System.out.println(cursor.val);
            cursor = cursor.next;
        }

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int X = 0, Cin = 0;
        ListNode out = new ListNode(0);
        ListNode cursor = out;

        while(l1 != null && l2 != null){
            X = l1.val + l2.val + Cin;
            Cin = X/10;
            X = X%10;
            //System.out.println(Cin+"\n"+X);

            cursor.next = new ListNode(X);
            cursor = cursor.next;
            l1 = l1.next; l2 = l2.next;
        }

        /*
        if(l1 == null && l2 !=null){
            cursor.next = l2;
        }else if(l1 != null && l2 ==null){
            cursor.next = l1;
        }*/

        return out.next;
    }
}
