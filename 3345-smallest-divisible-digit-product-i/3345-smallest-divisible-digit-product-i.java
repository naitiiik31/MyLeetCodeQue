class Solution {
    public int producti(int n){
        String s=String.valueOf(n);
        int ans=1;
        for(char ch:s.toCharArray()){
            ans=ans*(ch-'0');
        }
        return ans;
    }
    public int smallestNumber(int n, int t) {
        int ans=n;
        while(producti(ans)%t!=0){
            ans++;
        }
        return ans;
    }
}