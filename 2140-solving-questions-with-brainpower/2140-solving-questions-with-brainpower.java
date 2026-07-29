class Solution {
    public long c(int[][] mat,int idx,Long[] dp){
        if(idx>=mat.length) return 0;
        if(dp[idx]!=null) return dp[idx];

        long add=0;
        long notadd=0;

         add+=mat[idx][0]+c(mat,idx+mat[idx][1]+1,dp);
         notadd+=0+c(mat,idx+1,dp);

        return dp[idx]= Math.max(add,notadd);
    }
    public long mostPoints(int[][] questions) {
        Long dp[]=new Long[questions.length];
        return c(questions,0,dp);
    }
}