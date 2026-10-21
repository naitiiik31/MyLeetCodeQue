class Solution {
    public void c(int[] nums,int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        c(nums,0,n-1);
        c(nums,0,k-1);
        c(nums,k,n-1);
    }
}