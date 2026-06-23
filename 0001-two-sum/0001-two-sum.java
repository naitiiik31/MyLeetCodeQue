class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int i=0;
        int j=n-1;
        while(i<j){
            int sum=arr[i][0]+arr[j][0];
            if(sum>target){
                j--;
            }else if(sum<target){
                i++;
            }else{
                return new int[]{arr[i][1],arr[j][1]};
            }
        }
        return new int[]{-1,-1};
    }
}