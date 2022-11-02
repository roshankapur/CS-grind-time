package leetcode;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode a3 = new ListNode(3);
        ListNode a2 = new ListNode(4,a3);
        ListNode a1 = new ListNode(2,a2);
        ListNode b3 = new ListNode(4);
        ListNode b2 = new ListNode(6,b3);
        ListNode b1 = new ListNode(5,b2);

        ListNode out = addTwoNumbers(a1,b1);

        while (out.next!=null){
            System.out.print(out.val + " ");
        }


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int A, B, Cin = 0;

        ListNode outNode = new ListNode(0);
        ListNode cursor = new ListNode(0, outNode);
        //reference to head node of LL to be output


        while(l1.next != null && l2.next != null){
            A = l1.val;
            B = l2.val;

            if (Cin == 0) {
                if(A+B <= 9) outNode.val = A+B;
                else if (A+B > 9){
                    outNode.val = (A+B)%10;
                    Cin = 1;
                }
            }else {
                if (Cin + A + B <= 9) {
                    outNode.val = A + B + Cin;
                    Cin = 0;
                } else if (Cin + A + B > 9) {
                    outNode.val = (A + B + Cin) % 10;
                    Cin = 1;
                }
            }

            l1 = l1.next;
            l2 = l2.next;
            outNode.next = new ListNode(0);
            outNode = outNode.next;
        }

        return cursor.next;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}