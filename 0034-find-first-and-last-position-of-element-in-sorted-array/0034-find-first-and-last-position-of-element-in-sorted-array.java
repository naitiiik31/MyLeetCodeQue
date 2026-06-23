class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a1=-1;
        int a2=-1;
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target){
                //going to right side
                s=mid+1;
            }else if(nums[mid]==target){
                a1=mid;
                //goto left side
                e=mid-1;
            }else{//nums[mid]>target
                //goto left side
                e=mid-1;
            }
        }
         s=0;
         e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target){
                //going to right side
                s=mid+1;
            }else if(nums[mid]==target){
                a2=mid;
                //goto right side
                s=mid+1;
            }else{//nums[mid]>target
                //goto left side
                e=mid-1;
            }
        }
        return new int[]{a1,a2};
    }
}