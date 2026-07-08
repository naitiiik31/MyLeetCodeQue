class Solution {
    public int c(int[] nums,int idx,int[] dp){
        if(idx==nums.length-1) return 1;
        if(idx>=nums.length) return 0;
        if(nums[idx]==0) return 0;
        if(dp[idx]!=-1) return dp[idx];

        int val=nums[idx];
        int ans=0;
        for(int i = 1; i <= val; i++){
            if(c(nums, idx +i, dp) == 1){
                return dp[idx] = 1;
            }
        }
        return dp[idx] = 0;
       
    }
    public boolean canJump(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int ans= c(nums,0,dp);
        if(ans==0) return false;
        return true;
    }
}