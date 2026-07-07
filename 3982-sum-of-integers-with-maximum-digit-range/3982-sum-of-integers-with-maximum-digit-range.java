class Solution {
    public int maxDigitRange(int[] nums) {
        int[] temp=new int[nums.length];
        int n=nums.length;

        for(int i=0;i<n;i++){
            int[] f=new int[10];
            String s=String.valueOf(nums[i]);
            for(char ch:s.toCharArray()){
                f[ch-'0']++;
            }
            int mini=-1;
            int maxi=-1;
            for(int k=9;k>=0;k--){
                if(f[k]==0) continue;
                maxi=k;
                break;
            }
            for(int k=0;k<10;k++){
                if(f[k]==0) continue;
                mini=k;
                break;
            }
            temp[i]=maxi-mini;

        }

        int mm=-1;
        for(int num:temp) mm=Math.max(mm,num);

        int ans=0;
        boolean[] ch=new boolean[n];
        for(int i=0;i<n;i++){
            if(mm==temp[i]) ch[i]=true;
        }
        for(int i=0;i<n;i++){
            if(ch[i]) ans+=nums[i];
        }
        return ans;

    }
}