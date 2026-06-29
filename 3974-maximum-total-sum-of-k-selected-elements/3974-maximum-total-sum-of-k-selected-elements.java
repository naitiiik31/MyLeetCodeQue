class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n=nums.length;
        int idx=n-1;
        long ans=0;
        while(k!=0){
            int num=nums[idx];
            long s=0L;
            if(mul>0){
                s = 1L*mul*num;
            }else{
                s+=num;
            }
            ans+=s;
            mul--;
            k--;
            idx--;
        }
        return ans;
    }
}