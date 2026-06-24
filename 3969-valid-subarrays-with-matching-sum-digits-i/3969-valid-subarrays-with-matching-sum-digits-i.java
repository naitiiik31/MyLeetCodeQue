class Solution {
    public long first(long num){

        while(num>=10){
            num=num/10;
        }
        return num;
    }
    public long last(long num){
        return num%10;
    }
    public int countValidSubarrays(int[] nums, int x) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(first(sum)==x && last(sum)==x) ans++; 
            }
        }
        return ans;
    }
}