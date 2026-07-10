class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int ans=0;
        int pre=0;
        int n=nums.length;
        for(int i=0;i<n-k;i++){
            pre=Math.max(pre,nums[i]);
            ans=Math.max(ans,pre+nums[i+k]);
        }
        return ans;
    }
}