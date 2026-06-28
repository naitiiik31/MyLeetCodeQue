class Solution {
    public int c(int dice,int face,int t,int[][] dp){
        if(t<0) return 0;
        if(dice==0 && t!=0) return 0;
        if(dice!=0 && t==0) return 0;
        if(dice==0 && t==0) return 1;
        if(dp[dice][t]!=-1) return dp[dice][t];


        int ans=0;
        for(int i=1;i<=face;i++){
            ans=(ans+c(dice-1,face,t-i,dp))%1000000007;
        }
        dp[dice][t]=ans;
        return dp[dice][t];
    }
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp=new int[n+1][target+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<target+1;j++){
                dp[i][j]=-1;
            }
        }
        return c(n,k,target,dp);
    }
}