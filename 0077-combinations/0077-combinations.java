class Solution {
    public void c(List<List<Integer>> ans,List<Integer> out,int idx,int[] arr,int k,int c){
        if(c==k){
            ans.add(new ArrayList(out));
            return;
        }
        if(idx>=arr.length) return;

        //incl
        out.add(arr[idx]);
        c(ans,out,idx+1,arr,k,c+1);
        out.remove(out.size()-1);

        c(ans,out,idx+1,arr,k,c);

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> state=new ArrayList<>();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=i+1;


        c(ans,state,0,arr,k,0);
        return ans;
        
    }
}