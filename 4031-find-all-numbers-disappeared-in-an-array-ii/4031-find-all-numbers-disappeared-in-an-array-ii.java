class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<Integer> li=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int idx=lower;
        while(idx<=upper){
            if(set.contains(idx)){
                idx++;
            }else{
                li.add(idx);
                idx++;
            }
        }
        
        if(li.size()==0) return ans;
        int i=0;
        int j=1;
        int prev=i;
        int n=li.size();
        while(j<n){
            if(li.get(j)-li.get(prev)==1){
                prev=j;
                j++;
            }else{
                List<Integer> li1=new ArrayList<>();

                li1.add(li.get(i));
                li1.add(li.get(prev));

                ans.add(li1);
                prev=j;
                i=prev;
                j++;

            }
        }
        List<Integer> li2=new ArrayList<>();
        li2.add(li.get(i));
        li2.add(li.get(prev));

        ans.add(li2);
        return ans;

    }
}