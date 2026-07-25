class Solution {
    public int c(int[][] mat,int i,int j,Integer[][] dp){
         if(j<0 || j>=mat[0].length)
            return Integer.MAX_VALUE;
        if(i==mat.length-1){
            return mat[i][j];
        }
        if(dp[i][j]!=null) return dp[i][j];
        


        int and=mat[i][j]+Math.min(c(mat,i+1,j,dp),Math.min(c(mat,i+1,j-1,dp),c(mat,i+1,j+1,dp)));
        return dp[i][j]=and;
    }
    public int minFallingPathSum(int[][] matrix) {

        int n=matrix.length;    
        int ans=Integer.MAX_VALUE;
        Integer[][] dp=new Integer[matrix.length][matrix[0].length];
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         dp[i][j]=-1;
        //     }
        // }
        for(int i=0;i<n;i++){
            ans=Math.min(ans,c(matrix,0,i,dp));
        }
        return ans;

    }
}