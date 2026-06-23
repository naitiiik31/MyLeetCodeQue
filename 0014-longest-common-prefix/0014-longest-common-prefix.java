class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String s=strs[0];
        for(int k=1;k<n;k++){
            String str=strs[k];
            int i = 0;
            while (i < s.length() && i < str.length() && s.charAt(i) == str.charAt(i)) {
                i++;
            }

            s = s.substring(0, i);

        }
        return s;
    }
}