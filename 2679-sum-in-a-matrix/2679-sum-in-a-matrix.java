class Solution {
    public int matrixSum(int[][] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }
        int n=nums.length;
        int m=nums[0].length;

        int j=m-1;
        while(j!=-1){
            int maxi=0;
            for(int i=0;i<n;i++){
                maxi=Math.max(maxi,nums[i][j]);
            }
            ans+=maxi;
            j--;
        }
        return ans;

    }
}