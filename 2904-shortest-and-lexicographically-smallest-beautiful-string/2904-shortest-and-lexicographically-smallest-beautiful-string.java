class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<Integer> one=new ArrayList<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                one.add(i);
            }
        }
        if(one.size()<k) return "";
        String ans="";
        for(int i=0;i+k-1<one.size();i++){
            int st=one.get(i);
            int e=one.get(i+k-1);
            String curr=s.substring(st,e+1);
            if(ans.isEmpty() || ans.length()>curr.length() || (ans.length()==curr.length() && curr.compareTo(ans)<0)){
                ans=curr;
            }
        }
        return ans;
    }
}