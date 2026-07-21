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
class Pair{
    int c;
    int max;
    Pair(int c,int max){
        this.c=c;
        this.max=max;
    }
}
class Solution {
    
    public Pair c(TreeNode root){
        if(root==null) return new Pair(0,Integer.MIN_VALUE);
        

        Pair left=c(root.left);
        Pair right=c(root.right);

        int count=left.c+right.c;

        if(root.val>=left.max && root.val>=right.max) {
            count++;
        }

        int maxValue=Math.max(root.val,Math.max(left.max,right.max));

        return new Pair(count,maxValue);
        
    }
    public int countDominantNodes(TreeNode root) {
        Pair ans=c(root);
        return ans.c;
    }
}