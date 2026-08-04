class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int even=0,odd=0;
            for(int j=i;j<n;j++){
                if(nums[j]%2==1){
                    odd++;
                }else{
                    even++;
                }
                if(odd==0) continue;
                else if((double)even/odd<=(double)a/b) c++;
            }
        }
        return c;
    }
}