class Solution {
    public int c(int[] val,int i,int j,int[][] dp){
        if(i+1==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        int ans=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            ans=Math.min(ans,val[i]*val[j]*val[k]+c(val,i,k,dp)+c(val,k,j,dp));
        }
        dp[i][j]=ans;

        return dp[i][j];
    }
    public int minScoreTriangulation(int[] values) {
        int n=values.length;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return c(values,0,n-1,dp);
    }
}