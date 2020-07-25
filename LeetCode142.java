/**
 * LeetCode142
 */
public class LeetCode142 {

    public static void main(String[] args) {
        Solution s=new Solution();
        ListNode head=new ListNode(3);
        head.next=new ListNode(2);
        head.next.next=new ListNode(0);
        head.next.next.next=new ListNode(-4);
        head.next.next.next.next=head.next;
        System.out.println(s.detectCycle(head).val);
    }
}

/*
 * * Definition for singly-linked list.
 * 
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

 class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode step1 = head;
        ListNode step2 = head.next;
        while (step2 == null || step2.next == null) {

            if (step2 == step1) {
                System.out.println("Hello");
                    step1 = head;
                while (step1 != step2) {
                    step1 = step1.next;
                    step2 = step2.next.next;
                }
                return step1;
            }
            step1 = step1.next;
            System.out.println("Step-1: "+step1.val);
            step2 = step2.next.next;
            System.out.println("Step-1: "+step1.val);

        }
        return new ListNode(-1);
    }
    public static void Print(ListNode n){
        while(n!=null){
            System.out.println(n.val);
            n=n.next;
        }
    }
}