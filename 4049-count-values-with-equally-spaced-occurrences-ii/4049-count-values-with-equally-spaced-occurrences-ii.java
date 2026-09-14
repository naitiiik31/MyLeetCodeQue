class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,List<Integer>> pos=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            pos.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        int ans=0;
        for(List<Integer> list:pos.values()){
            if(list.size()>=3){
                int gap=list.get(1)-list.get(0);
                boolean flag=true;
                for(int i=2;i<list.size();i++){
                    if(list.get(i)-list.get(i-1)!=gap){
                        flag=false;
                        break;
                    }
                }
                if(flag) ans++;
            }
        }
        return ans;
    }
}