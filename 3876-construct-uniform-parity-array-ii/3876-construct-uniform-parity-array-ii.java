class Solution {
    public boolean uniformArray(int[] nums1) {
        int midodd=Integer.MAX_VALUE;
        boolean isOdd=false;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==1){
                isOdd=true;
                if(midodd>nums1[i]) midodd=nums1[i];
            }
        }
        if(!isOdd) return true;
        for(int num:nums1){
            if(num%2==0 && midodd>=num) return false;
        }
        return true;
    }
}