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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode curr=head;

        LinkedHashMap<Integer,Integer> mp=new LinkedHashMap<>();

        while(curr!=null){
            mp.put(curr.val,mp.getOrDefault(curr.val,0)+1);
            curr=curr.next;
        }

        ListNode ans=new ListNode(-1);
        ListNode temp=ans;

        for(int val:mp.keySet()){
            if(mp.get(val)==1){
                ListNode l=new ListNode(val);
                temp.next=l;
                temp=temp.next;
            }
        }
        return ans.next;

    }
}