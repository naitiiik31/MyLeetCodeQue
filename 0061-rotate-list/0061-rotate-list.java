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
        if(k==0) return head;
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode head1=head;
        ListNode tail=head;
        int size=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        
        int hi=(size-k-1+100*size)%size;
        ListNode temp1=head;
        while(hi!=0){
            temp1=temp1.next;
            hi--;
        }

        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        ListNode ans=temp1.next;
        temp1.next=null;

        return ans;


    }
}