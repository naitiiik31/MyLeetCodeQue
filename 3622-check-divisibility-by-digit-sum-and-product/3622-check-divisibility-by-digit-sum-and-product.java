class Solution {
    public int sumOf(int n){
        int temp=n;
        int sum=0;
        while(temp>0){
            int r=temp%10;
            sum+=r;
            temp/=10;
        }
        return sum;
    }
    public int ProOf(int n){
        int temp=n;
        int pro=1;
        while(temp>0){
            int r=temp%10;
            pro*=r;
            temp/=10;
        }
        return pro;
    }
    public boolean checkDivisibility(int n) {
        int check=sumOf(n)+ProOf(n);
        if(n%check==0) return true;
        return false;
    }
}