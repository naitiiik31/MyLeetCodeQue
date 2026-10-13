class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int n=nums.length;
        int[] arr=new int[n];

        int i=0;
        int j=n-1;
        int idx=0;
        while(i<=j && idx<n){
            arr[idx]=nums[j];
            idx++;
            j--;
            if(i<j) {
                arr[idx]=nums[i];
                idx++;
                i++;
            }
        }
        for(int ii=0;ii<n;ii=ii+2){
            ans+=Math.pow(arr[ii],2);
        }
        for(int ii=1;ii<n;ii=ii+2){
            ans-=Math.pow(arr[ii],2);
        }
        return ans;
    }
}