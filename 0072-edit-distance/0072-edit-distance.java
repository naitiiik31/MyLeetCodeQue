class Solution {
    public int c(String w1,String w2,int i,int j,int[][] dp){
        if(i>=w1.length()) return w2.length()-j;
        if(j>=w2.length()) return w1.length()-i;
        if(dp[i][j]!=-1) return dp[i][j];

        int ans=0;
        if(w1.charAt(i)==w2.charAt(j)){
            return c(w1,w2,i+1,j+1,dp);
        }else{
            int IA=1+c(w1,w2,i,j+1,dp);
            int DA=1+c(w1,w2,i+1,j,dp);
            int RA=1+c(w1,w2,i+1,j+1,dp);
            ans=Math.min(IA,Math.min(DA,RA));
        }
        return dp[i][j]=ans;
    }
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();

        int[][] dp=new int[n1][n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                dp[i][j]=-1;
            }
        }
        return c(word1,word2,0,0,dp);
    }
}