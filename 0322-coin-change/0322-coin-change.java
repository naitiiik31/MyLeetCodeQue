class Solution {
    public int c(int[] coins,int t,int[] dp){
        if(t==0) return 0;//t is zero so do not pick any coin
        if(t<0) return Integer.MAX_VALUE;//invalid case and we find min coins

        if(dp[t]!=-1) return dp[t];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int next=c(coins,t-coins[i],dp);
            if(next!=Integer.MAX_VALUE) ans=Math.min(ans,1+next);
        }
        return dp[t]=ans;
    }
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int ans=c(coins,amount,dp);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}