class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Arrays.sort(words);
        LinkedHashMap<String,Integer> freq=new LinkedHashMap<>();
        for(String word:words){
            freq.put(word,freq.getOrDefault(word,0)+1);
        }

        List<Map.Entry<String, Integer>> list=new ArrayList<>(freq.entrySet());
        list.sort((a, b)->b.getValue()-a.getValue());
        List<String> ans=new ArrayList<>();
        for(Map.Entry<String, Integer> entry:list) {
            if(k==0) break;
            ans.add(entry.getKey());
            k--;
        }
        return ans;
    }
}