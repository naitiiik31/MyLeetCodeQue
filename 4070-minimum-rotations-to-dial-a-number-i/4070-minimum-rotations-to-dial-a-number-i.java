
class Solution {
    public int minRotations(String s) {
        int ans = 0;
        int prev = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - '0';
            int diff = Math.abs(curr - prev);

            ans += Math.min(diff, 10 - diff);
            prev = curr;
        }

        return ans;
    }
}
