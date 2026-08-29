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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans=new ListNode[k];
        int idx=0;

        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int baseSize=len/k;
        int extraNode=len%k;

        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ans[idx++]=curr;
            int width=baseSize+(extraNode>0 ? 1:0);
            extraNode--;
            for(int i=0;i<width;i++){
                prev=curr;
                curr=curr.next;
            }
            prev.next=null;

            prev=null;//mistake common people do
        }
        return ans;
    }
}