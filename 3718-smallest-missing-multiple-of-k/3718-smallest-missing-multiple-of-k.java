class Solution {
    public boolean c(int[] nums,int x){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x) return true;
        }
        return false;
    }
    public int missingMultiple(int[] nums, int k) {
        int x=1;
        while(true){
            if(x%k==0 && !c(nums,x)){
                return x;
            }
            x++;
        }
    }
}