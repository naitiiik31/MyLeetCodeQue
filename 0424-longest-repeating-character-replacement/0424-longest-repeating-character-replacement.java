class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int res=0;
        int i=0,maxFreq=0;

        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,hm.get(ch));

            while((j-i+1)-maxFreq>k){
                char l=s.charAt(i);
                hm.put(l,hm.get(l)-1);
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}