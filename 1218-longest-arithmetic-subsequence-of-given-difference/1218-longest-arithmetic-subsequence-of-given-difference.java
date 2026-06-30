class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer,Integer> dp=new HashMap<>();
        int n=arr.length;

        int ans=0;
        for(int i=0;i<n;i++){
            int temp=arr[i]-difference;
            int tempAns=0;

            if(dp.containsKey(temp)){
                tempAns=dp.get(temp);
            }
            dp.put(arr[i],1+tempAns);
            ans=Math.max(ans,dp.get(arr[i]));
        }
        return ans;

    }
}