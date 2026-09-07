class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] max=new int[nums.length];
        int[] min=new int[nums.length];
        int n=nums.length;
        int maxi=nums[0];
        int mini=nums[n-1];
        max[0]=maxi;
        min[nums.length-1]=mini;

        for(int i=1;i<nums.length;i++){
            maxi=Math.max(nums[i],maxi);
            max[i]=maxi;
        }
        for(int i=n-2;i>=0;i--){
            mini=Math.min(nums[i],mini);
            min[i]=mini;
        }
        for(int i=0;i<n;i++){
            if(max[i]-min[i]<=k) return i;
        }
        return -1;

    }
}