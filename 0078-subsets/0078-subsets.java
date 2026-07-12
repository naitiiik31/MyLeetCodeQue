class Solution {
    public void c(List<List<Integer>> li,List<Integer> oup,int[] nums,int i){
        if(i>=nums.length){
            li.add(new ArrayList<>(oup));
            return;
        }

        //exclude
        c(li,oup,nums,i+1);

        //include
        oup.add(nums[i]);
        c(li,oup,nums,i+1);
        oup.remove(oup.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();

        List<Integer> oup=new ArrayList<>();

        c(li,oup,nums,0);
        return li;


    }
}