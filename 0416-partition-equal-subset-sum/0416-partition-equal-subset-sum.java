class Solution {
    public int c(int[] nums,int idx,int t,int dp[][]){
        if(idx>=nums.length) return 0;
        if(t<0) return 0;
        if(t==0) return 1;
        if(dp[idx][t]!=-1) {
            return dp[idx][t];
        }

        int inc=c(nums,idx+1,t-nums[idx],dp);
        int excl=c(nums,idx+1,t,dp);
        int ans=inc + excl;
        if(ans==0)  dp[idx][t]= 0;
        else  dp[idx][t]= 1;
        return dp[idx][t];
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums)sum+=num;
        if((sum&1)==1) return false;

        int t=sum/2;
        int dp[][]= new int[nums.length][t+1];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=t;j++){
                dp[i][j]=-1;
            }
        }
        if(c(nums,0,t,dp)>0) return true;
        return false;
    }
}