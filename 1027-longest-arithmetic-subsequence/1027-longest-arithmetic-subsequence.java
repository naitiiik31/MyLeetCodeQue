class Solution {
    public int c(int idx,int diff,int[] A,HashMap<Integer,Integer>[]  dp){
        if(idx<0) return 0;
        if(dp[idx].containsKey(diff)){
            return dp[idx].get(diff);
        }
        int ans=0;
        for(int j=idx-1;j>=0;j--){
            if(A[idx]-A[j]==diff){
                ans=Math.max(ans,1+c(j,diff,A,dp));
            }
        }
        dp[idx].put(diff,ans);
        return ans;
    }
    public int longestArithSeqLength(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;

        HashMap<Integer,Integer>[]  dp=new HashMap[n+1];

        for(int i=0;i<n;i++) dp[i]=new HashMap<>();

        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ans=Math.max(ans,2+c(i,nums[j]-nums[i],nums,dp));
            }
        }
        return ans;
    }
}