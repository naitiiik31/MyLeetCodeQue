class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb=new StringBuilder();
        String s=String.valueOf(n);

        for(char ch:s.toCharArray()){
            if(ch!='0') sb.append(ch);
        }
        String ans=sb.toString();
        int x=0;
        if(ans=="") x=0;
        else x=Integer.parseInt(ans);
        long sum=0;
        int n1=x;
        while(n1!=0){
            int s1=n1%10;
            sum+=s1;
            n1=n1/10;
        }
        return x*sum;
    }
}