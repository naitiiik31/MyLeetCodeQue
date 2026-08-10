class Solution {
    private int getDepth(int i, int[] parent, int[] d) {
        if (d[i] != -1) return d[i]; 
        if (parent[i] == -1) return d[i] = 0; 
        
        d[i] = getDepth(parent[i], parent, d) + 1;
        return d[i];
    }
    public long weightedSum(int[] parent, int[] nums) {
        int n=parent.length;
        int[] d=new int[n];
        Arrays.fill(d, -1);
        int idx=0;
        int val=0;

        for(int i=0;i<n;i++) {
            val=Math.max(val, getDepth(i, parent, d));
        }

        // int height=d[d.length-1];
        long[] ans=new long[n];
        for(int i=0;i<n;i++){
            ans[i]=(long)nums[i]*(val-d[i]+1);
        }
        long ans1=0;
        for(long num:ans) ans1+=num;
        return ans1;

    }
}