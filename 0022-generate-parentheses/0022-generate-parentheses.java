class Solution {
    public void c(List<String> ans,int l,int r,String s,int n){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(l<n){
            c(ans,l+1,r,s+'(',n);
        }
        if(r<l){
            c(ans,l,r+1,s+')',n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        c(ans,0,0,"",n);
        return ans;
    }

}