class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        int[] dp=new int[n+1];
        for(int i=n-1;i>=0;i--){
            int best=Integer.MIN_VALUE;
            int remainingDay=0;
            for(int k=1;k<=3;k++){
                if(i+k>n) break;
                remainingDay+=stoneValue[i+k-1];
                best=Math.max(best,remainingDay-dp[i+k]);

            }
            dp[i]=best;
        }
        if(dp[0]>0) return "Alice";
        else if(dp[0]<0) return "Bob";
        else return "Tie";
    }
}