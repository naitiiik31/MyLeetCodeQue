class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        String ss= sb.toString();
        for(int i=ss.length()-1;i>=0;i--){
            sb1.append(ss.charAt(i));
        }
        return sb1.toString();
    }
}