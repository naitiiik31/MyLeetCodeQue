class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int[] cost={cost1,cost2};
        long[][] dp=new long[total+1][2];
        for(int i=0;i<total+1;i++){
            for(int j=0;j<2;j++){
                dp[i][j]=-1;
            }
        }
        return  1+ c(total,cost,0,dp);
    }
    public long c(int total, int[] cost, int si,long[][] dp){
        if(si==cost.length-1){
            return total/cost[si];
        }
        if(total==0){
            return 0;
        }
        if(dp[total][si]!=-1) return dp[total][si];
        long pick=0;
        long notPick=c(total,cost,si+1,dp);
        if(total-cost[si]>=0){
           pick = 1 + c(total-cost[si],cost,si,dp);
        }
        return dp[total][si]= pick+notPick;
    }
}