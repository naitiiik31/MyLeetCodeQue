class Solution {
    public int c(int[] s,int idx,int t,int[][] dp){
        if(idx==s.length) return 0;
        if(dp[idx][t]!=-1) return dp[idx][t];

        int incl=s[idx]*(t+1)+c(s,idx+1,t+1,dp);
        int excl=0+c(s,idx+1,t,dp);


        dp[idx][t]= Math.max(incl,excl);
        return dp[idx][t];
    }
    public int maxSatisfaction(int[] s) {
        Arrays.sort(s);
        int n=s.length;
        int[][] dp=new int[n+1][n+1];


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }

        return c(s,0,0,dp);
    }
}