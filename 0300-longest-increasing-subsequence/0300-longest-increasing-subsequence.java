class Solution {
    public int c(int[] nums,int curr,int prev,int[][] dp){
        if(curr==nums.length) return 0;
        if(dp[curr][prev+1]!=-1) return dp[curr][prev+1];
        int take=0;
        if(prev==-1 || nums[curr]>nums[prev]){
            take=1+c(nums,curr+1,curr,dp);
        }
        int nottake=c(nums,curr+1,prev,dp);

        dp[curr][prev+1]=Math.max(take,nottake);
        return dp[curr][prev+1];
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }
        return c(nums,0,-1,dp);
    }
}