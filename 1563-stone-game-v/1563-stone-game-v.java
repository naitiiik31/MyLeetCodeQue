class Solution {
    public int c(int[] s,int[] p,int l,int r,int[][] dp){
        if(l>=r) return 0;
        if(dp[l][r]!=-1) return dp[l][r];
        
        int score=0;
        for(int i=l;i<r;i++){
           int lsum=p[i]-p[l]+s[l];
           int rsum=p[r]-p[i];

            if(lsum<rsum){
                score=Math.max(score,lsum+c(s,p,l,i,dp));
            }
            else if(lsum>rsum){
                score=Math.max(score,rsum+c(s,p,i+1,r,dp));
            }else{
                score=Math.max(score,Math.max(lsum+c(s,p,l,i,dp),rsum+c(s,p,i+1,r,dp)));
            }
            

        }
        return dp[l][r]=score;
    }
    public int stoneGameV(int[] s) {
        int n=s.length;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        int p[]=new int[n];
        p[0]=s[0];
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+s[i];
        }
        return c(s,p,0,n-1,dp);
    }
}