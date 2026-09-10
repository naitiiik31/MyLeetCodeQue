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
    int ans=0;
    class Pair{
        int f=0;
        int s=0;
        Pair(int f,int s){
            this.f=f;
            this.s=s;
        }
    }

    public Pair findAvg(TreeNode root){
        if(root==null) return new Pair(0,0);
        Pair leftP=findAvg(root.left);
        Pair rightP=findAvg(root.right);

        int sum=root.val+leftP.f+rightP.f;
        int count=1+leftP.s+rightP.s;
        int avg=sum/count;

        if(avg==root.val) ans++;

        return new Pair(sum,count);
    }

    public int averageOfSubtree(TreeNode root) {
        findAvg(root);
        return ans;
    }
}