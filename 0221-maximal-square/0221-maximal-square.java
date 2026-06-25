class Solution {
    int maxi=0;
    public int c(char[][] mat,int i,int j,int[][] dp ){
        if(i>=mat.length || j>=mat[0].length) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int r=c(mat,i,j+1,dp);
        int d=c(mat,i+1,j+1,dp);
        int dow=c(mat,i+1,j,dp);

        if(mat[i][j]=='1'){
            dp[i][j]=1+Math.min(r,Math.min(d,dow));
            maxi=Math.max(dp[i][j],maxi);
            return dp[i][j];
        }else{
            return dp[i][j]=0;
        }
    }
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        maxi=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        c(matrix,0,0,dp);

        return maxi*maxi;
    }
}