class Solution {
    public int c(int[] obs,int lane,int pos,int[][] dp){
        int n=obs.length-1;

        if(pos==n) return 0;

        if(dp[lane][pos]!=-1) return dp[lane][pos];

        if(obs[pos+1]!=lane){
            return c(obs,lane,pos+1,dp);
        }else{
            int ans=Integer.MAX_VALUE;
            for(int i=1;i<=3;i++){
                if(lane!=i && obs[pos]!=i){
                    ans=Math.min(ans,1+c(obs,i,pos,dp));
                }
            }
            dp[lane][pos]=ans;
            return dp[lane][pos];
        }
    }
    public int minSideJumps(int[] obs) {
        int n=obs.length;
        int[][] dp=new int[4][n];

        for(int i=0;i<4;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return c(obs,2,0,dp);
    }
}