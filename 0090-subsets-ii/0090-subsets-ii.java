class Solution {
    public void c(int[] nums,List<List<Integer>> ans,List<Integer> out,int i){
        if(i>=nums.length){
            // List<Integer> li=new ArrayList<>();
            ans.add(new ArrayList<>(out));
            return;
        }
        //exclude
        c(nums,ans,out,i+1);
        //include
        out.add(nums[i]);
        c(nums,ans,out,i+1);
        out.remove(out.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<List<Integer>> ans1=new ArrayList<>();
        List<Integer>  oup=new ArrayList<>();
        c(nums,ans,oup,0);
        Set<List<Integer>> s=new HashSet<>();
        for(List<Integer> l:ans) s.add(l);
        for(List<Integer> l:s) ans1.add(l);


        return ans1;
    }
}