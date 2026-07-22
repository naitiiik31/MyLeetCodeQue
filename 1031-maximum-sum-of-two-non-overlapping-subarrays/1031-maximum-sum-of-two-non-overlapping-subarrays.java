class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int n = nums.length;

        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        return Math.max(
            helper(prefix, firstLen, secondLen),
            helper(prefix, secondLen, firstLen)
        );
    }

    // L comes before M
    private int helper(int[] prefix, int L, int M) {
        int n = prefix.length - 1;
        int maxL = 0;
        int ans = 0;

        for (int i = L + M; i <= n; i++) {
            maxL = Math.max(maxL, prefix[i - M] - prefix[i - M - L]);

            int sumM = prefix[i] - prefix[i - M];

            ans = Math.max(ans, maxL + sumM);
        }

        return ans;
    }
}