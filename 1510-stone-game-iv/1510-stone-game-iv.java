class Solution {
    public int c(int n,int[] dp){
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];

        for(int i=1;i*i<=n;i++){
            if(c(n-i*i,dp)==0){
                return dp[n]=1;
            }
        }
        return dp[n]=0;

    }
    public boolean winnerSquareGame(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int a= c(n,dp);
        if(a>=1) return true;
        return false;
    }
}