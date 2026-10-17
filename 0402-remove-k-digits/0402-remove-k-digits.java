class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();
        if(num.length()==k) return "0";
        st.push(num.charAt(0)-'0');
        StringBuilder sb=new StringBuilder();
        int i=1;
        for( i=1;i<num.length() && k!=0;i++){
            while(!st.isEmpty() && k!=0 && st.peek()>(num.charAt(i)-'0')){
                st.pop();
                k--;
            }
            st.push(num.charAt(i)-'0');
        }
        while(i<num.length()){
            st.push(num.charAt(i)-'0');
            i++;
        }
        while(k!=0){
            st.pop();
            k--;
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        String ans= sb.reverse().toString();
        int ii=0;
        while(ii<ans.length() && ans.charAt(ii)=='0'){
            ii++;
        }
        String ans1= ans.substring(ii);
        
        if(ans1.equals("")) return "0";
        
        return ans1;
    }
}