class Solution {
    public boolean c(int num,int s){
        int temp=num;
        int sum=0;
        while(temp!=0){
            int t=temp%10;
            sum+=t;
            temp/=10;
        }
        return sum==s;
    }
    public int largestInteger(int n, int s) {
        int ans=-1;
        // if(s==0) return 0;
        if(n==1){
            for(int i=9;i>=0;i--){
                if(c(i,s)){
                    ans=i;
                    break;
                }
            }
        }
        if(n==2){
            for(int i=99;i>=0;i--){
                if(c(i,s)){
                    ans=i;
                    break;
                }
            }
        }
        if(n==3){
            for(int i=999;i>=0;i--){
                if(c(i,s)){
                    ans=i;
                    break;
                }
            }
        }
        if(n==4){
            for(int i=9999;i>=0;i--){
                if(c(i,s)){
                    ans=i;
                    break;
                }
            }
        }
        if(n==5){
            for(int i=99999;i>=0;i--){
                if(c(i,s)){
                    ans=i;
                    break;
                }
            }
        }
        return ans;
    }
}