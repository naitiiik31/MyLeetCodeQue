class Solution {
    public int[] productQueries(int n, int[][] queries) {
         List<Integer> powers = new ArrayList<>();

        for (int i = 0; i < 31; i++) {
            if ((n & (1 << i)) != 0) {
                powers.add(1 << i);
            }
        }
        int idx=0;
        int[] ans=new int[queries.length];
        for(int[] a:queries){
            int s=a[0];
            int e=a[1];
            long sum=1;

            for(int i=s;i<=e;i++){
                sum=(sum*powers.get(i))%1_000_000_007;
            }
            ans[idx++]=(int)sum;
        }
        return ans;
    }
}