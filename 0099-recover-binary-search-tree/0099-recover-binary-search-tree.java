/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode first,second,prev;
    public void recoverTree(TreeNode root) {
        c(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
    void c(TreeNode node){
        if(node==null) return;

        c(node.left);

        if(prev!=null && prev.val>node.val){
            if(first==null){
                first=prev;
            }
            second=node;
        }
        prev=node;
        c(node.right);
    }
}