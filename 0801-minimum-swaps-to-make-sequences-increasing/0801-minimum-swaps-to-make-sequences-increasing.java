
class Solution {
    public int c(int[] n1,int[] n2,int idx,int swap,int[][] dp){
        if(idx==n1.length) return 0;

        if(dp[idx][swap]!=-1) return dp[idx][swap];

        int prev1=n1[idx-1];
        int prev2=n2[idx-1];

        if(swap==1){
            int temp=prev1;
            prev1=prev2;
            prev2=temp;
        }
        //no swap
        int ans=Integer.MAX_VALUE;
        if(prev1<n1[idx] && prev2<n2[idx]){
            ans=c(n1,n2,idx+1,0,dp);
        }
        if(prev1<n2[idx] && prev2<n1[idx]){
            ans=Math.min(ans,1+c(n1,n2,idx+1,1,dp));
        }
        return dp[idx][swap]=ans;
    }
    public int minSwap(int[] nums1, int[] nums2) {
        int swap=0;
        int n=nums1.length;
        int[] n1=new int[n+1];
        int[] n2=new int[n+1];
        n1[0]=-1;
        n2[0]=-1;

        for(int i=0;i<n;i++){
            n1[i+1]=nums1[i];
            n2[i+1]=nums2[i];
        }
        int[][] dp=new int[n1.length][2];
        for(int i=0;i<n1.length;i++){
            for(int j=0;j<2;j++){
                dp[i][j]=-1;
            }
        }
        return c(n1,n2,1,swap,dp); 
    }
}