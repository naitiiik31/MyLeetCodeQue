class Solution {
    public void moveZeroes(int[] arr) {
           int pos=0;
           for(int i=0;i<arr.length;i++){
              if(arr[i]!=0){
                int temp=arr[pos];
                arr[pos]=arr[i];
                arr[i]=temp;
                pos++;
              }
           }
    }
}