class Solution {
    public int c(int sum,int t,int[][] mat,int row,int[][] dp){
        if(row>=mat.length){
            //invalid row
            return Math.abs(t-sum);
        }
        if(dp[sum][row]!=-1) return dp[sum][row];
        
        int mini=Integer.MAX_VALUE;

        for(int num:mat[row]){
            int a=c(sum+num,t,mat,row+1,dp);
            mini=Math.min(mini,a);
        }
        return dp[sum][row]=mini;
    }
    public int minimizeTheDifference(int[][] mat, int target) {
        int row=0;
        int sum=0;
        int max=0;
        for(int i=0;i<mat.length;i++){
            int s=0;
            for(int j=0;j<mat[0].length;j++){
               s=Math.max(s,mat[i][j]);
            }
            max+=s;
        }
        int[][] dp=new int[max+1][mat.length];//?
        for(int i=0;i<=max;i++){
            for(int j=0;j<mat.length;j++){
                dp[i][j]=-1;
            }
        }
        return c(sum,target,mat,row,dp);
    }
}