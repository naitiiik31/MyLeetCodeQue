class Solution {
    String mini="";
    public void c(int i,String s,String target,int[] count){
        int n=target.length();
        if(i==n){
            if(s.compareTo(target)>0){
                mini=mini.compareTo(s) < 0 ? mini : s;
            }
            return;
        }

        if(count[target.charAt(i)-'a']>0){//same char exist
            count[target.charAt(i)-'a']--;
            c(i+1,s+target.charAt(i),target,count);
            count[target.charAt(i)-'a']++;//backtract step
        }

        for(int j=target.charAt(i)-'a'+1;j<26;j++){
            if(count[j]>0){
                s += (char)('a' + j);
                count[j]--;
                for(int k=0;k<26;k++){
                    while(count[k]>0){
                        s+=(char)('a'+k);
                        count[k]--;
                    }
                }
                mini=mini.compareTo(s)<0 ? mini : s;
                return;
            }
        }
    }
    public String lexGreaterPermutation(String s, String target) {
        int[] count=new int[26];
        char[] chars=s.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb=new StringBuilder();

        for(int i=chars.length-1;i>=0;i--){
            sb.append(chars[i]);
        }
        s=sb.toString();
        if(s.compareTo(target)<=0) return "";

        mini=s;
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }

        c(0,"",target,count);
        return mini;
        
    }
}