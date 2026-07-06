class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        Map<Integer, Integer> sm = mp.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).limit(k).collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (e1, e2) -> e1,
            LinkedHashMap::new
        ));

        int[] ans=new int[k];
        int i=0;

        for(Map.Entry<Integer,Integer> entry:sm.entrySet()) {
            if(i==k) break;
            ans[i++]=entry.getKey();
        }

        return ans;

    }
}