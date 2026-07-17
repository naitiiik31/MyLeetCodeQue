class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        List<Integer> al=new ArrayList<>();
        Deque<Integer> maxi=new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!maxi.isEmpty() && arr[maxi.peekLast()]<=arr[i]){
                maxi.pollLast();
            }
            maxi.offerLast(i);
        }
        for(int i=k;i<arr.length;i++){
            al.add(arr[maxi.peekFirst()]);

            while(!maxi.isEmpty() && i-maxi.peekFirst()>=k)
                maxi.pollFirst();
            
            //add
            while(!maxi.isEmpty() && arr[maxi.peekLast()]<=arr[i]){
                maxi.pollLast();
            }

            maxi.offerLast(i);
        }
        al.add(arr[maxi.peekFirst()]);

        int[] ans=new int[al.size()];
        int idx=0;
        for(int num:al) ans[idx++]=num;
        return ans;

    }
}