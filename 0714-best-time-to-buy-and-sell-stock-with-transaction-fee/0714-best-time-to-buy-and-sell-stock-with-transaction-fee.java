class Solution {
    public int c(int[] arr,int fee,int idx,int b,int[][] dp){
        if(idx>=arr.length) return 0;
        if(dp[idx][b]!=-1) return dp[idx][b];

        int ans=0;

        if(b==1){
            int bK=-arr[idx]+c(arr,fee,idx+1,0,dp);
            int SK=0+c(arr,fee,idx+1,1,dp);
            ans=Math.max(bK,SK);
        }else{
            int SK=arr[idx]+c(arr,fee,idx+1,1,dp)-fee;
            int skip=0+c(arr,fee,idx+1,0,dp);
            ans=Math.max(SK,skip);
        }
        return  dp[idx][b]= ans;

    }
    public int maxProfit(int[] prices, int fee) {
        int[][] dp=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<2;j++){
                dp[i][j]=-1;
            }
        }
        return c(prices,fee,0,1,dp);
    }
}