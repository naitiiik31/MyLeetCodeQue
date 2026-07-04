class Solution {
    public int c(String s,String p,int i,int j,int[][] dp){
        if(i<0 && j<0) return 1;
        if(i>=0 && j<0) return 0;
        if(i<0 && j>=0){
            for(int k=0;k<=j;k++){
                if(p.charAt(k)!='*') return 0;
            }
            return 1;
        }
        if(dp[i][j]!=-1) return dp[i][j];

        //match
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            int k= c(s,p,i-1,j-1,dp);
            if(k>=1) return dp[i][j]=1;
            else return dp[i][j]=0;
        }else if(p.charAt(j)=='*'){
            int c1=c(s,p,i-1,j,dp);
            int c2=c(s,p,i,j-1,dp);
            int k= c1 + c2;
            if(k>=1) return dp[i][j]=1;
            else return dp[i][j]=0;
        }else{
            return dp[i][j]=0;
        }
    }
    public boolean isMatch(String s, String p) {
        int dp[][]=new int[s.length()][p.length()];
        for(int i=0;i<s.length();i++)
            for(int j=0;j<p.length();j++) 
                dp[i][j]=-1;
        int k= c(s,p,s.length()-1,p.length()-1,dp);
        if(k==1) return true;
        return false;
    }
}