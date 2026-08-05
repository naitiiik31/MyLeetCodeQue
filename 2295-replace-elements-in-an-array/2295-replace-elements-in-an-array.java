class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int[] i:operations){
            nums[hm.get(i[0])]=i[1];
            hm.put(i[1],hm.get(i[0]));
        }
        return nums;
    }
}