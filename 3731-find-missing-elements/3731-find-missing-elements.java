class Solution {
    public boolean c(int[] num,int x){
        for(int i=0;i<num.length;i++){
            if(num[i]==x){
                return true;
            }
        }
        return false;
    }
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int x=nums[0];
        int y=nums[nums.length-1];
        List<Integer> al=new ArrayList<>();
        for(int i=x;i<y;i++){
            if(!c(nums,i)){
                al.add(i);
            }
        }
        return al;
    }
}