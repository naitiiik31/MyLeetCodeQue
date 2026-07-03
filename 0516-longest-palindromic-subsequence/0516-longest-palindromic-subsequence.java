class Solution {
    public int c(String s1,String s2,int i,int j,int[][] dp){
        if(i>=s1.length()) return 0;
        if(j>=s2.length()) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        int ans=0;

        if(s1.charAt(i)==s2.charAt(j)){
            return 1+c(s1,s2,i+1,j+1,dp);
        }else{
            ans=Math.max(c(s1,s2,i+1,j,dp),c(s1,s2,i,j+1,dp));
        }
        return dp[i][j]=ans;
    }
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                dp[i][j]=-1;
        String rs= sb.toString();

        return c(s,rs,0,0,dp);
    }
}