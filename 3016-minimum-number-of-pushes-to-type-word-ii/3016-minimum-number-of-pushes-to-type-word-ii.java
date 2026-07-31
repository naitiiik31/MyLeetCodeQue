class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        for (int i=0;i<freq.length/2;i++) {
            int temp=freq[i];
            freq[i]=freq[freq.length-1-i];
            freq[freq.length-1-i]=temp;
        }
        int ans=0;
        for (int i=0;i<26;i++) {
            if(i<8) ans+=freq[i];
            else if(i<16) ans+=2*freq[i];
            else if(i<24) ans+=3*freq[i];
            else ans+=4*freq[i];
        }
        return ans;
    }
}