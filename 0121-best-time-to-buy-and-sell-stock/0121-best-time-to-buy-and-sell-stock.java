class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
            int diff=prices[i]-buy;//sell-buy
            profit=Math.max(profit,diff);
            buy=Math.min(buy,prices[i]);
        }
        return profit;
    }
}