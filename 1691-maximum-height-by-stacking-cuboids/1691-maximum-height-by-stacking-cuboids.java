class Solution {
    public boolean check(int[] base,int[] newb){
        return newb[0]<=base[0] && newb[1]<=base[1] && newb[2]<=base[2];
    }
    public int c(int[][] cuboids,int cur,int prev,int[][] dp){
        int n=cuboids.length;
        if(cur==n) return 0;

        if(dp[cur][prev+1]!=-1) return dp[cur][prev+1];

        int take=0;
        if(prev==-1 || check(cuboids[cur],cuboids[prev])){
            take=cuboids[cur][2]+c(cuboids,cur+1,cur,dp);
        }
        int nottake=0+c(cuboids,cur+1,prev,dp);

        dp[cur][prev+1]=Math.max(take,nottake);
        return dp[cur][prev+1];
    }
    public int maxHeight(int[][] cuboids) {
        int n=cuboids.length;
        for(int[] c:cuboids){
            Arrays.sort(c);
        }
        Arrays.sort(cuboids,(a,b)->{
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
            if(a[1]!=b[1]) return Integer.compare(a[1],b[1]);
            return Integer.compare(a[2],b[2]);
        });

        int[][] dp=new int[n][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }

        return c(cuboids,0,-1,dp);
    }
}