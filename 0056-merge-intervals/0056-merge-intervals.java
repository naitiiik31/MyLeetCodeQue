class Solution {
    public int[][] merge(int[][] mat) {
        // Arrays.sort(mat,(a,b)->Integer.compare(a[0],b[0]));
        // Arrays.sort(mat,(a,b)->Integer.compare(a[1],b[1]));
        Arrays.sort(mat,(a,b)->{
            if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        }
        );
        int st=mat[0][0];
        int end=mat[0][1];
        List<List<Integer>> f=new ArrayList<>();
        // int[][] ans=new int[mat.length][2];
        int idx=0;
        for(int i=1;i<mat.length;i++){
            if(mat[i][0]<=end){
                 end = Math.max(end, mat[i][1]);
            }else{

                List<Integer> temp=new ArrayList<>();
                temp.add(st);
                temp.add(end);
                f.add(temp);
                st=mat[i][0];
                end=mat[i][1];
            }
        }
        List<Integer> temp1=new ArrayList<>();
        temp1.add(st);
        temp1.add(end);
        f.add(temp1);
        

        int[][] ans=new int[f.size()][2];
        for(List<Integer> ll:f){
            ans[idx][0]=ll.get(0);
            ans[idx][1]=ll.get(1);
            idx++;
        }
        return ans;
    }
}