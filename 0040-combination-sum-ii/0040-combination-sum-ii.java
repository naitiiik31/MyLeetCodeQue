class Solution {
    public void c(List<List<Integer>> ans,List<Integer>out,int idx,int[] cand,int t){
        if(t==0){
            ans.add(new ArrayList(out));
            return;
        }
        if(idx>=cand.length) return;
        if(t<0) return;

        //incl
        out.add(cand[idx]);
        c(ans,out,idx+1,cand,t-cand[idx]);
        out.remove(out.size()-1);

        //excl
        int n=idx+1;
        while(n<cand.length && cand[idx]==cand[n]) n=n+1;
        c(ans,out,n,cand,t);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> out=new ArrayList<>();
        c(ans,out,0,candidates,target);

        return ans;
    }
}