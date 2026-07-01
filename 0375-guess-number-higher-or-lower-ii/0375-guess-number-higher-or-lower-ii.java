class Solution {
    public int c(int s,int e,int[][] dp){
        if(s>=e) return 0;
        if(dp[s][e]!=-1) return dp[s][e];
        int maxi=Integer.MAX_VALUE;
        for(int i=s;i<=e;i++){
            maxi=Math.min(maxi,i+Math.max(c(s,i-1,dp),c(i+1,e,dp)));
        }
        return dp[s][e]=maxi;
    }
    public int getMoneyAmount(int n) {
        // i+max(f(1,i-1),f(i+1,n))
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return c(1,n,dp);
    }
}