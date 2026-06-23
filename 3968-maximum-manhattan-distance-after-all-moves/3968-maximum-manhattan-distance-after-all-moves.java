class Solution {
    public int[] L(int x,int y){
        return new int[]{x-1,y};
    }
    public int[] R(int x,int y){
        return new int[]{x+1,y};
    }
    public int[] D(int x,int y){
        return new int[]{x,y-1};
    }
    public int[] U(int x,int y){
        return new int[]{x,y+1};
    }
    public int maxDistance(String moves) {
        int[] ar=new int[2];
        ar[0]=0;
        ar[1]=0;
        int ans=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='L') ar[1]--;
            if(ch=='R') ar[1]++;
            if(ch=='D') ar[0]--;
            if(ch=='U') ar[0]++;
            if(ch=='_'){
               ans++;
            }
        }
        return Math.abs(ar[0])+Math.abs(ar[1])+ans;
    }
}