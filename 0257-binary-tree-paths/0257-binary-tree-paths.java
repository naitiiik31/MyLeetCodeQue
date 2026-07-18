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
    public void c(TreeNode root,List<String> ans,String out){
        if(root==null) return;
        out = out.isEmpty() ? String.valueOf(root.val) : out + "->" + root.val;
        if(root.left==null && root.right==null){
            ans.add(out);
            return;
        }

        c(root.left,ans,out);
        c(root.right,ans,out);

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        String out="";
        c(root,ans,out);
        return ans;
    }
}