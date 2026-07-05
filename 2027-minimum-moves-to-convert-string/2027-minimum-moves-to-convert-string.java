class Solution {
    public int minimumMoves(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='O') continue;
            else{
                ans++;
                i++;
                i++;
            }
        }
        return ans;
    }
}