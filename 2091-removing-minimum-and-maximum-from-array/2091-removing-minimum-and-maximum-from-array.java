class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxidx=-1;
        int minidx=-1;

        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                maxidx=i;
            }
            if(min>nums[i]){
                min=nums[i];
                minidx=i;
            }
        }
        int n=nums.length;
        int left=Math.min(minidx,maxidx);
        int right=Math.max(minidx,maxidx);
        int removeLeft=right+1;
        int removeRight=n-left;
        int removeBoth=(left+1)+(n-right);
        return Math.min(removeLeft,Math.min(removeRight,removeBoth));


    }
}