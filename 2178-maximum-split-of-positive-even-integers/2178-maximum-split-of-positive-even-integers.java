class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> ans=new ArrayList<>();
        if(finalSum%2==1) return ans;

        long i=2,s=0;

        while(s+i<=finalSum){
            s+=i;
            ans.add(i);
            i+=2;
        }
        
        if(s<finalSum){
            ans.set(ans.size()-1,ans.get(ans.size()-1)+(finalSum-s));
        }

        return ans;
        
    }
}