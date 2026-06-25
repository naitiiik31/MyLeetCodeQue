class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n=days.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return c(0,days,costs,dp);
    }
    public int c(int i,int[] days,int[] costs,int[] dp){
        if(i>=days.length) return 0;
        if(dp[i]!=-1) return dp[i];

        //1day
        int c1=costs[0]+c(i+1,days,costs,dp);
        //7day
        int j=i;
        while(j<days.length && days[j]<days[i]+7) j++;
        int c7=costs[1]+c(j,days,costs,dp);
        //10day
         j=i;
        while(j<days.length && days[j]<days[i]+30) j++;
        int c30=costs[2]+c(j,days,costs,dp);

        dp[i]=Math.min(c1,Math.min(c7,c30));
        return dp[i];
    }
}