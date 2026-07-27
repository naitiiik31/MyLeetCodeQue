class Solution {
    public long c(int idx,int k,int decide,int n,int[] prices,Long dp[][][]){
        if(idx==n){
            if(k>=0 && decide==0){
                return 0;
            }
            return Integer.MIN_VALUE;
        }
        if(dp[idx][k][decide]!=null) return dp[idx][k][decide];

        long take=Integer.MIN_VALUE;
        long nottake=Integer.MIN_VALUE;

        if(k>0){
            if(decide==1){
                take=prices[idx]+c(idx+1,k-1,0,n,prices,dp);
            }else if(decide==2){
                take=-prices[idx]+c(idx+1,k-1,0,n,prices,dp);
            }else{
                take=Math.max(prices[idx]+c(idx+1,k,2,n,prices,dp),-prices[idx]+c(idx+1,k,1,n,prices,dp));
            }
        }
        nottake=c(idx+1,k,decide,n,prices,dp);
        return dp[idx][k][decide]=Math.max(take,nottake);
    }
    public long maximumProfit(int[] prices, int k) {
        Long[][][] dp=new Long[prices.length][k+1][3];
        return c(0,k,0,prices.length,prices,dp);
    }

}