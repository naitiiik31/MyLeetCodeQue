class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();

        al1.add(nums[0]);
        al2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            if(al1.get(al1.size()-1)>al2.get(al2.size()-1)){
                al1.add(nums[i]);
            }else{
                al2.add(nums[i]);
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<al1.size();i++){
            al.add(al1.get(i));
        }
        for(int i=0;i<al2.size();i++){
            al.add(al2.get(i));
        }
        int ans[]=new int[al.size()];
        for(int i=0;i<al.size();i++){
            ans[i]=al.get(i);
        }
        return ans;
    }
}