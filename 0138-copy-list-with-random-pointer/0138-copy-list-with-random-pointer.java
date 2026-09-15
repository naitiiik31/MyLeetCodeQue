/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        //add clone node
        Node temp=head;
        while(temp!=null){
            Node clone=new Node(temp.val);
            clone.next=temp.next;
            temp.next=clone;
            temp=clone.next;
        }
        //Copy random pointer
        temp=head;
        while(temp!=null){
            Node oldNode=temp;
            Node newNode=temp.next;
            if(oldNode.random!=null){
                newNode.random=oldNode.random.next;
            }
            temp=newNode.next;
        }

        //detech the list
        temp=head;
        Node ansListHead=head.next;
        while(temp!=null){
            Node oldNode=temp;
            Node clone=temp.next;
            oldNode.next=clone.next;
            if(clone.next!=null){
                clone.next=clone.next.next;
            }
            temp=temp.next;
        }
        return ansListHead;

    }
}