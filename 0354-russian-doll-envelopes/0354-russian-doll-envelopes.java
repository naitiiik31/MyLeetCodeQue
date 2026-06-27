class Solution {
    public int c(int[][] envelopes){
        int n=envelopes.length;
        if(n==0) return 0;
        List<Integer> ans=new ArrayList<>();
        ans.add(envelopes[0][1]);

        for(int[] arr:envelopes){
            int d=arr[1];
            if(d>ans.get(ans.size()-1)){
                ans.add(d);
            }else{
                int idx=LB(ans,d);
                ans.set(idx,d);
            }
        }
        return ans.size();
    }
    public int LB(List<Integer> li,int t){
        int s=0;
        int e=li.size()-1;
        int ans=li.size();
        while(s<=e){
            int m=s+(e-s)/2;
            if(li.get(m)>=t){
                ans=m;
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return ans;
    }
    public int maxEnvelopes(int[][] envelopes) {

        Arrays.sort(envelopes,(a,b)->{
        if (a[0]!=b[0]) {
            return Integer.compare(a[0],b[0]); 
        }
        return Integer.compare(b[1],a[1]);   
        });

        return c(envelopes);
    }
}