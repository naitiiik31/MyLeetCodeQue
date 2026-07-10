class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int ans=0;
        for(List<Integer> li:triangle){
            Collections.sort(li);
            ans+=li.get(0);
        }
        return ans;
    }
}