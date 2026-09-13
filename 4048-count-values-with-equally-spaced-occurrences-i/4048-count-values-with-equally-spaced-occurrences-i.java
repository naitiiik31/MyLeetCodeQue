class Solution {
    public int countSpecialIntegers(int[] nums) {

        int[] freq=new int[101];
        for(int num:nums){
            freq[num]++;
        }
        int ans=0;
        for(int i=0;i<101;i++){
            if(freq[i]==3){
                int t=i;
                int[] three=new int[3];
                int idx=0;
                for(int ii=0;ii<nums.length;ii++){
                    if(nums[ii]==t){
                        three[idx++]=ii;
                    }

                }
                if(three[2]-three[1]==three[1]-three[0]) ans++;
            }
        }
        return ans;
    }
}