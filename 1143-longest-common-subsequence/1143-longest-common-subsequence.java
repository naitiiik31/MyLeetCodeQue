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
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                dp[i][j]=-1;
            }
        }
        return c(text1,text2,0,0,dp);
    }
}