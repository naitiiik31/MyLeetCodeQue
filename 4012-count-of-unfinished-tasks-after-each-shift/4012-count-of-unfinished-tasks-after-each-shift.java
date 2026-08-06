class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n=tasks.length;
        long[] p=new long[n];
        long s=0;
        for(int i=0;i<n;i++){
            s+=tasks[i];
            p[i]=s;
        }
        long d=0;
        int[] res=new int[shifts.length];
        for(int i=0;i<shifts.length;i++){
            if(d+shifts[i]>=s){
                res[i]=0;
                d=0;
            }else{
                d+=shifts[i];
                int st=0,e=n;

                while(st<e){
                    int mid=st+(e-st)/2;
                    if(p[mid]<=d){
                        st=mid+1;
                    }else{
                        e=mid;
                    }
                }
                res[i]=n-st;
            }
        }
        return res;

    }
}