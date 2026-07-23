class Solution {
    public int c(int[] arr,int k,int idx,Integer[] dp){
        if(idx>=arr.length) return Integer.MIN_VALUE;
        if(dp[idx]!=null) return dp[idx];

        int energy=arr[idx];
        if(idx+k<arr.length){
            energy+=c(arr,k,idx+k,dp);
        }
        return dp[idx]=energy;
    }
    public int maximumEnergy(int[] energy, int k) {
        int ans=Integer.MIN_VALUE;
        int n=energy.length;
        Integer[] dp=new Integer[n];
        // Arrays.fill(dp,-1);
        for(int i=0;i<n;i++){
            ans=Math.max(ans,c(energy,k,i,dp));
        }
        return ans;
    }
}