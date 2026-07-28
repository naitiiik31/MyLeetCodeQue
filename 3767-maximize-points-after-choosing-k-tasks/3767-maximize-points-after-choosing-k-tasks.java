import java.util.*;

class Solution {
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        int n = technique1.length;

        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;

        Arrays.sort(idx, (a, b) ->
            Integer.compare(
                technique1[b] - technique2[b],
                technique1[a] - technique2[a]
            )
        );

        long ans = 0;

        // Initially choose technique2 for all tasks
        for (int x : technique2) ans += x;

        // Force first k tasks to use technique1
        for (int i = 0; i < k; i++) {
            int id = idx[i];
            ans += (long) technique1[id] - technique2[id];
        }

        // Use technique1 for remaining tasks only if beneficial
        for (int i = k; i < n; i++) {
            int id = idx[i];
            if (technique1[id] > technique2[id]) {
                ans += (long) technique1[id] - technique2[id];
            }
        }

        return ans;
    }
}