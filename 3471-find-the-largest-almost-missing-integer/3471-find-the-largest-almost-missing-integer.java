class Solution {
    public int largestInteger(int[] arr, int k) {
        int n = arr.length;

        if (n == 1) return arr[0];

        if (n == k) {
            int max = -1;
            for (int num : arr) {
                max = Math.max(max, num);
            };
            return max;
        }

        if (k == 1) {
            int[] freq = new int[51];
            for (int num : arr){
                freq[num]++;
            }
            for (int i = 50; i >= 0; i--) {
                if (freq[i] == 1){
                    return i;
                }
            }
            return -1;
        }

        int first = arr[0];
        int last = arr[n - 1];
        int firstCount = 0, lastCount = 0;

        for (int num : arr) {
            if (num == first) firstCount++;
            if (num == last) lastCount++;
        }

        if (firstCount == 1 && lastCount == 1)
            return Math.max(first, last);
        if (firstCount == 1) return first;
        if (lastCount == 1) return last;

        return -1;
    }
}