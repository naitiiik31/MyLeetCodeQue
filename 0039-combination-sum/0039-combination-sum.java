class Solution {
    public void c(int[] can,int t,int idx, List<List<Integer>> ans,List<Integer> out){
        if(t<0) return;
        if(t==0){
            ans.add(new ArrayList(out));
            return;
        }
        if(idx>=can.length) return;

        //inclu
        out.add(can[idx]);
        c(can,t-can[idx],idx,ans,out);
        out.remove(out.size()-1);

        //exclude
        c(can,t,idx+1,ans,out);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> out=new ArrayList<>();
         c(candidates,target,0,ans,out);
         return ans;
    }
}