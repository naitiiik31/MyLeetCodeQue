class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int need=0;
        int ans=0;
        for(int num:nums){
            ans+=Math.max(need-num,0);
            need=Math.max(need,num)+1;
        }
        return ans;
    }
}