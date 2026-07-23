class Solution {
    public int c(String s){
        int n=s.length();
        int arr[]=new int[n];
        int i=0;
        for(char ch:s.toCharArray()){
            arr[i]=ch-'0';
            i++;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public int minPartitions(String n) {
        return c(n);
    }
}