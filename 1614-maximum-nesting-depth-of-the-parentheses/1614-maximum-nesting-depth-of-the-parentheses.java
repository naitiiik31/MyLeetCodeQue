class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();

        int ans=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            if(s.charAt(i)==')'){
                st.pop();
            }
            int k=st.size();
            ans=Math.max(ans,k);
        }
        return ans;
    }
}