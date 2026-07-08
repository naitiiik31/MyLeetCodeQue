/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return null;

        ListNode temp=head;
        int count=0;
        while(temp!=null && count<k){
            temp=temp.next;
            count++;
        }

        if(count<k) return head;

        ListNode curr=head;
        ListNode n=null;
        ListNode prev=null;
        count=0;

        while(curr!=null && count<k){
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
            count++;
        }

        //recusion ko bolo ki solve kare
        if(n!=null){
            head.next=reverseKGroup(n,k);
        }
        return prev;

    }
}