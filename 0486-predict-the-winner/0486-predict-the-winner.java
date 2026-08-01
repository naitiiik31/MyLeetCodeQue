class Solution {
    public int c(int[] num,int i,int j,Integer[][] dp){
        if(i==j) return num[i];
        if(dp[i][j]!=null) return dp[i][j];

        int l=num[i]-c(num,i+1,j,dp);
        int r=num[j]-c(num,i,j-1,dp);
        return dp[i][j]= Math.max(l,r);
    }
    public boolean predictTheWinner(int[] nums) {
        Integer[][] dp=new Integer[nums.length][nums.length];

        return c(nums,0,nums.length-1,dp)>=0;
    }
}