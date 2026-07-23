class Solution {
    public int mirrorFrequency(String s) {
        int[] fc=new int[26];
        int[] fd=new int[10];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                fd[ch-'0']++;
            }else{
                fc[ch-'a']++;
            }
        }
        int ans=0;
        boolean[] v=new boolean[26];
        boolean[] vd=new boolean[10];
        Arrays.fill(v,false);
        Arrays.fill(vd,false);

        for(char ch:s.toCharArray()){
            
            if(Character.isDigit(ch)){
                if(!vd[ch-'0']){
                    int k1=fd[ch-'0'];
                    char ch2=(char)('9'-(ch-'0'));
                    int k2=fd[ch2-'0'];
                    ans+=(Math.abs(k1-k2));
                    vd[ch-'0']=true;
                    vd[ch2-'0']=true;
                }
            }else{
                    if(!v[ch-'a']){
                        int k1=fc[ch-'a'];
                        char ch2=(char)('z'-(ch-'a'));
                        int k2=fc[ch2-'a'];
                        ans+=(Math.abs(k1-k2));
                        v[ch-'a']=true;
                        v[ch2-'a']=true;
                    }
                }
        }
        return ans;
        
    }
}