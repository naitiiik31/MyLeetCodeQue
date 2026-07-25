class Solution {
    public int c(int[][] grid,int i,int j,Integer[][] dp){
        if(j<0 || j>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==grid.length-1){
            return grid[i][j];
        }
        if(dp[i][j]!=null) return dp[i][j];

        int ans=Integer.MAX_VALUE;
        for(int col=0;col<grid[0].length;col++){
            if(col!=j)
                ans=Math.min(ans,c(grid,i+1,col,dp));
        }
        return dp[i][j]= grid[i][j]+ans;
    }
    public int minFallingPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Integer[][] dp=new Integer[n][m];

        int ans=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            ans=Math.min(ans,c(grid,0,i,dp)); 
        }
        return ans;
    }
}