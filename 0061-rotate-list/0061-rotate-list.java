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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        if (head.next == null) return head; 
        if(k==0) return head;
        ListNode last=head;
        ListNode kth=head;
        ListNode headreturn=head;

        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }

        int kz=k%size;

        if(kz==0) return head;


        int move=size-kz-1;        
        while(move!=0) {
            kth=kth.next;
            move--;
        }

        headreturn=kth.next;
        last=headreturn;
        while(last.next!=null){
            last=last.next;
        }

        kth.next=null;
        last.next=head;
        return headreturn;
    }
}