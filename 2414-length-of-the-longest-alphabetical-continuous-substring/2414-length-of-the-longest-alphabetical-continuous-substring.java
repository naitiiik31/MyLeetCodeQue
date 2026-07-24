class Solution {
    public int longestContinuousSubstring(String s) {
        int ans=1;
        int c=1;
        for(int j=1;j<s.length();j++){
            if((s.charAt(j)-'a')-1==(s.charAt(j-1)-'a')){
                c++;
                ans=Math.max(c,ans);
            }else{
                c=1;
            }
        }
        return ans;
    }
}