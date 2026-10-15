class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int n=temperatures.length;
        int[] arr=new int[n];
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(i);
                arr[i]=0;
            }
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(i);
                arr[i]=0;
            }else{
                // st.push(i);
                arr[i]=st.peek()-i;
                st.push(i);
            }
        }
        return arr;
    }
}