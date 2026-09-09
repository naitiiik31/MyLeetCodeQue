class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int[][] mat=new int[n+1][2];
        for(int i=0;i<n;i++){
            mat[i][0]=intervals[i][0];
            mat[i][1]=intervals[i][1];
        }
        mat[n][0]=newInterval[0];
        mat[n][1]=newInterval[1];

        Arrays.sort(mat,(a,b)->Integer.compare(a[0],b[0]));
        n=mat.length;
        int[][] ans=new int[n][2];
        int[][] res=new int[n][2];
        res[0]=mat[0];
        int e=0;
        
        for(int i=1;i<n;i++){
            if(mat[i][0]<=res[e][1]){
                res[e][1]=Math.max(res[e][1],mat[i][1]);
            }else{
                e++;
                res[e]=mat[i];
            }
        }
        return Arrays.copyOfRange(res,0,e+1);
    }
}