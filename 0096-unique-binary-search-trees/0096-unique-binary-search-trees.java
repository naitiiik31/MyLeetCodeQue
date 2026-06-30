class Solution {
    public int c(int n,int[] dp){
        int ans=0;
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];

        for(int i=1;i<=n;i++){
            ans+=c(i-1,dp)*c(n-i,dp);
        }

        return dp[n]=ans;
    }
    public int numTrees(int n) {
        //f(n)=f(i-1)*f(n-i)
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return c(n,dp);
        
    }
}