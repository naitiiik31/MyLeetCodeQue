class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        arr1[0]=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++){
            max=Math.max(max,nums[i]);
            arr1[i]=Math.max(max,nums[i]);
        }
        arr2[n-1]=nums[n-1];
        int min=arr2[n-1];
        for(int i=n-2;i>=0;i--){
            min=Math.min(nums[i],min);
            arr2[i]=Math.min(min,nums[i]);
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr1[i]-arr2[i];
        }
        int c=-1;
        for(int i=0;i<n;i++){
            if(ans[i]<=k){
                c=i;
                return c;
            }
        }
        return c;
    }
}