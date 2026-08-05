class Solution {
    public long flowerGame(int n, int m) {
        if(n%2==0){
            long k=n/2;
            return k*m;
        }else if(m%2==0){
            long k=m/2;
            return k*n;
        }
        return m*n/2;
    }
}