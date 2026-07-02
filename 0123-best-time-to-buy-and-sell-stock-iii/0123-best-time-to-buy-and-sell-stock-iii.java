class Solution {
    public int c(int[] arr,int idx,int buy,int limit,int[][][] dp){
        if(arr.length==idx) return 0;
        if(limit==0) return 0;
        if(dp[idx][buy][limit]!=-1) return dp[idx][buy][limit];

        int profit=0;
        if(buy==1){
            int buyKaro=-arr[idx]+c(arr,idx+1,0,limit,dp);
            int skipKaro=0+c(arr,idx+1,1,limit,dp);
            profit=Math.max(buyKaro,skipKaro);
        }else{
            int sellKaro=arr[idx]+c(arr,idx+1,1,limit-1,dp);
            int skipKaro=0+c(arr,idx+1,0,limit,dp);
            profit=Math.max(sellKaro,skipKaro);
        }
        return dp[idx][buy][limit]=profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n][2][3];

        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k]=-1;
                }
            }
        }

        return c(prices,0,1,2,dp);
    }
}