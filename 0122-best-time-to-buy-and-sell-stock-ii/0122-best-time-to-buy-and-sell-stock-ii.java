class Solution {
    public int c(int[] prices,int idx,int buy,int[][] dp){
        if(idx==prices.length) return 0;
        if(dp[idx][buy]!=-1) return dp[idx][buy];

        int profit=0;
        if(buy==1){
            int buyKaro=-prices[idx]+c(prices,idx+1,0,dp);
            int skipKaro=0+c(prices,idx+1,1,dp);
            profit=Math.max(buyKaro,skipKaro);
        }else{
            int sellkaro=prices[idx]+c(prices,idx+1,1,dp);
            int skipKaro=0+c(prices,idx+1,0,dp);
            profit=Math.max(sellkaro,skipKaro);
        }
        return dp[idx][buy]= profit;

    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                dp[i][j]=-1;
            }
        }
        return c(prices,0,1,dp);
    }
}