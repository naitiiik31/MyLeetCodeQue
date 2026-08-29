class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n=nums.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }
        Arrays.sort(temp);
        List<Deque<Integer>> list=new ArrayList<>();
        HashMap<Integer,Integer> grp=new HashMap<>();
        int grpIdx=0;
        list.add(new LinkedList<>());
        list.get(grpIdx).offer(temp[0]);
        grp.put(temp[0],0);
        for(int i=1;i<n;i++){
            if(temp[i]-list.get(grpIdx).peekLast()>limit){
                //new grp index
                grpIdx++;
                list.add(new LinkedList<>());
            }
            grp.put(temp[i],grpIdx);
            list.get(grpIdx).offer(temp[i]);
        }

        for(int i=0;i<n;i++){
            int gi=grp.get(nums[i]);
            nums[i]=list.get(gi).poll();
        }
        return nums;

    }
}