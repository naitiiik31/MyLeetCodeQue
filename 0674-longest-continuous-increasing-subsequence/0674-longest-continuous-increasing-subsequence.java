class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans=1;
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                c++;
            }else{
                c=1;
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }
}