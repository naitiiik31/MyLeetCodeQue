class Solution {
    public void moveZeroes(int[] arr) {
           int pos = 0;                         // next place for a non-zero
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    int t = arr[pos]; arr[pos] = arr[i]; arr[i] = t;   // swap forward
                    pos++;
                }
            }
    }
}