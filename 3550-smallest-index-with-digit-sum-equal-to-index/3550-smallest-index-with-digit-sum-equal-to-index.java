class Solution {
    public int c(int num){
        int sum=0;
        while(num>0){
            int k=num%10;
            sum+=k;
            num/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(i==c(nums[i])){
                return i;
            }
        }
        return -1;
    }
}