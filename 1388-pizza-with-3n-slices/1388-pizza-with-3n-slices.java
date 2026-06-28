class Solution {
    public int c(int[] sli,int idx,int endidx,int n,int[][] dp){
        if(idx>endidx || n==0) return 0;
        if(dp[idx][n]!=-1) return dp[idx][n];

        int take=sli[idx]+c(sli,idx+2,endidx,n-1,dp);
        int nottake=0+c(sli,idx+1,endidx,n,dp);
        return dp[idx][n]=Math.max(take,nottake);
    }
    public int maxSizeSlices(int[] slices) {
        int k=slices.length;
        int[][] dp1=new int[k][k];
        int[][] dp2=new int[k][k];

        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                dp1[i][j]=-1;
                dp2[i][j]=-1;
            }
        }
        int c1=c(slices,0,k-2,k/3,dp1);
        int c2=c(slices,1,k-1,k/3,dp2);
        return Math.max(c1,c2);
    }
}