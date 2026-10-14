class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            if(sum>=target){
                ans=Math.min(ans,r-left+1);
            }
            while(sum>=target && r>=left){
                ans=Math.min(ans,r-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;
    }
}