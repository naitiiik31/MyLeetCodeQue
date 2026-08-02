class Solution {
    public int maximumWidth(int[] planks) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        HashMap<Integer,Integer> res=new HashMap<>();

        for(int num:planks){
            freq.put(num,freq.getOrDefault(num,0)+1);
            res.put(num,res.getOrDefault(num,0)+1);
        }

        for(int a:freq.keySet()){
            for(int b:freq.keySet()){
                if(a<b){
                    res.put(a+b,res.getOrDefault(a+b,0)+Math.min(freq.get(a),freq.get(b)));
                }
                if(a==b){
                    res.put(a+b,res.getOrDefault(a+b,0)+freq.get(a)/2);
                }   
            }
        }

        int ans=0;
        for(int v:res.values()){
            ans=Math.max(ans,v);
        }
        return ans;

    }
}