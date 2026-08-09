class Solution {
    public int c(int[] piles,int person,int i,int M,int[][][] dp){
        if(i>=piles.length) return 0;
        if(dp[person][i][M]!=-1) return dp[person][i][M];
        int result=(person==1)?0:Integer.MAX_VALUE;

        int stone=0;
        for(int x=1;x<=Math.min(2*M,piles.length-i);x++){
            stone+=piles[i+x-1];
            if(person==1){
                result=Math.max(result,stone+c(piles,0,i+x,Math.max(M,x),dp));
            }else{
                result=Math.min(result,c(piles,1,i+x,Math.max(M,x),dp));
            }
        }
        return dp[person][i][M]= result;
    }
    public int stoneGameII(int[] piles) {
        int[][][] dp=new int[2][piles.length][piles.length+1];
        int n=piles.length;
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n+1;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return c(piles,1,0,1,dp);
    }

}