class Solution {
    public boolean notfound(int val,List<Integer> notput){
        for(int num:notput){
            if(num==val) return true;
        }
        return false;
    }
    public int minimumSum(int n, int k) {
        List<Integer> notput=new ArrayList<>();
        int[] ans=new int[n];
        int idx=0;

        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(!notfound(i,notput)){

                ans[idx++]=i;
            }
            if(idx==n) break;
            notput.add(k-i);
        }
        int an=0;
        for(int num:ans){
            an+=num;
        }
        return an;

    }
}