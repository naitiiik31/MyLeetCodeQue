class Solution {
    public int c(int num){
        int sum=0;
        while(num!=0){
            int temp=num%10;
            sum+=temp;
            num/=10;
        }
        return sum;
    }
    public int addDigits(int num) {
        int ans=0;
        if(num<10) return num;
        while(num>=10){
            num=c(num);
        }
            ans+=num;
        return ans;
    }
}