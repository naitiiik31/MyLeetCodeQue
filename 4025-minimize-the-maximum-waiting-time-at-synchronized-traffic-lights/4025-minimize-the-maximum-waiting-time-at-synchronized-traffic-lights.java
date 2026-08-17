class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int maxAns=Integer.MIN_VALUE;
        int maxLight=Integer.MIN_VALUE;

        for(int light:lights){
            maxLight=Math.max(light,maxLight);
        }
        for(int at:arrivalTime){
            int curr=at%period;
            if(curr>=maxLight){
                maxAns=Math.max(maxAns,period-curr);
            }
        }
        if(maxAns==Integer.MIN_VALUE){
            return 0;
        }
        return maxAns;
    }
}