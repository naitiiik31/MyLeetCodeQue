class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int c=0;
        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            if(seq.charAt(i)=='('){
                ans[i]=c%2;
                c++;
            }else{
                c--;
                ans[i]=c%2;
            }
        }
        return ans;
    }
}