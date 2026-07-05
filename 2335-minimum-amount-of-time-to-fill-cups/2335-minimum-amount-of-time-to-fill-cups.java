class Solution {
    public int fillCups(int[] amount) {
        int ans=0;
        int i=0;
        int j=2;
        while(amount[0]+amount[1]+amount[2]!=0 && i<=j){
            Arrays.sort(amount);
            if(amount[i]!=0){
                ans++;
                if(i!=j){
                    amount[i]--;
                    amount[j]--;
                }else{
                    amount[i]--;
                }
            }else{
                i++;
            }
        }
        return ans;
    }
}