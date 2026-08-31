class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.toLowerCase();
        for(char ch:s.toCharArray()){
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9') ){
                sb.append(ch);
            }
        }
        String ans=sb.toString();
        int i=0;
        int j=ans.length()-1;
        while(i<j){
            if(ans.charAt(i)!=ans.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
}