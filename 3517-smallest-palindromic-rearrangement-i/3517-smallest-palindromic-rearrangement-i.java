class Solution {
    public String smallestPalindrome(String s) {
        int[] f=new int[26];
        for(char ch:s.toCharArray()) {
            f[ch-'a']++;
        }

        int n=s.length();
        int idx=0;

        StringBuilder sb = new StringBuilder(s);
        for (int i=0;i<n;i++) sb.setCharAt(i, ' ');

        int mid=n/2;

        for(int i=0;i<26;i++) {
            if(f[i]==0)continue;

            while(f[i]>=2) {
                sb.setCharAt(idx,(char)(i+'a'));
                sb.setCharAt(n-idx-1,(char)(i+'a'));
                idx++;
                f[i]-=2;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (f[i]==1) {
                sb.setCharAt(mid,(char)(i+'a'));
                break;
            }
        }

        return sb.toString();
    }
}