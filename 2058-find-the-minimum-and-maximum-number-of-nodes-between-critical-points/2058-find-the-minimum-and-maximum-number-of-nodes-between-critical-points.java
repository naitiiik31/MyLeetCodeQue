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

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int size=1;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size<=2) return new int[]{-1,-1};

        int[] ans=new int[2];
        List<Integer> li=new ArrayList<>();

        ListNode curr=head.next;
        ListNode prev=head;
        ListNode next=head.next.next;
        int c=2;
        while(next!=null){
            if((curr.val>prev.val && curr.val>next.val) || (curr.val<prev.val && curr.val<next.val)){
                li.add(c);
            }
            c++;
            curr=curr.next;
            prev=prev.next;
            next=next.next;
        }
        Collections.sort(li);
        if(li.size()<2) return new int[]{-1,-1};
        int maxVal=li.get(li.size()-1)-li.get(0);
        int minVal=Integer.MAX_VALUE;
        for(int i=1;i<li.size();i++){
            if(minVal>li.get(i)-li.get(i-1)){
                minVal=li.get(i)-li.get(i-1);
            }
        }
        ans[0]=minVal;
        ans[1]=maxVal;
        return ans;

    }
}