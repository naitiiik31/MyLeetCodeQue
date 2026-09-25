class Solution {
    public int countIntersectingIntervals(int[][] interval) {
        int ans=0;
        int n=interval.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((interval[i][1]>=interval[j][0] && interval[i][0]<=interval[j][1]) || (interval[i][1]>=interval[j][1] && interval[i][0]<=interval[j][1])) ans++;
            }
        }
        return ans;
    }
}