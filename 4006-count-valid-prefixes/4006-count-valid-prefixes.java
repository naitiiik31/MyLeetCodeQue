class Solution {
    public int countValidPrefixes(String s) {
        int[] f=new int[2];

        int ans=0;
        for(char ch:s.toCharArray()){
            f[ch-'0']++;
            if(f[0]==f[1]+1 || f[0]+1==f[1] || f[0]==f[1]) ans++;
        }
        return ans;
    }
}